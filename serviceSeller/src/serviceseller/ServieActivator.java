package serviceseller;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import servicebuyer.ServieBuy;


public class ServieActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {		
		System.out.println("Start seller service");
		serviceReference=context.getServiceReference(ServieBuy.class.getName());
		ServieBuy serviceBuy = (ServieBuy) context.getService(serviceReference);
		System.out.println(serviceBuy.buyService());
		
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Good Bye !!!");
		context.ungetService(serviceReference);
		
	}
	
}
