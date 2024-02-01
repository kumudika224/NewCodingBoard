package servicepublisher;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;


public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;
	

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Customer");
		ServicePublish publisherService = new ServicePublishImpl();
		publishServiceRegistration = context.registerService(ServicePublish.class.getName(),publisherService,null);
		
		
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stoped Customer");
		publishServiceRegistration.unregister();
	}

}
