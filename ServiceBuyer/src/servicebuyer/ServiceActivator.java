package servicebuyer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration buyServiceRegistration;
	
	
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Buyer");
		ServieBuy buyerservice = new ServicebuyImpl();
		buyServiceRegistration = context.registerService(
				ServieBuy.class.getName(),buyerservice,null);
					
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Stoped Buyer");
		buyServiceRegistration.unregister();
	}

}
