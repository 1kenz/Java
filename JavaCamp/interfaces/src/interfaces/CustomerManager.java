package interfaces;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println("Customer added " + customer.getFirstName());
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " logged to DB");
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted " + customer.getFirstName());
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " logged to DB");
	}
}
