package interfaces;

public class CustomerManager {
	
	private Logger logger;
	
	
	public CustomerManager(Logger logger) {
			this.logger = logger;
	}

	public void add(Customer customer) {
		System.out.println("Customer added " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
}


// loosly coupled ***
// tightly coupled