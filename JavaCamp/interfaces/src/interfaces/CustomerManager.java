package interfaces;

import java.util.Iterator;

public class CustomerManager {
	
	private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}

	// dependency loosly- tightly coupled
	
	public void add(Customer customer) {
		System.out.println("Customer added " + customer.getFirstName());
		// DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " logged to DB");
		
		for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		}
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted " + customer.getFirstName());
		// DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " logged to DB");
		for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		}
	}
}
