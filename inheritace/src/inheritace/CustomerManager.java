package inheritace;

public class CustomerManager {
	
	// SOLID - Open Closed Principle
	
	public void add(Customer customer) {
		System.out.println(customer.id + " added.");
	}
	
	// public void add(IndividualCustomer customer) {
	// 	System.out.println(customer.id + " added.");
	// }
	
	// public void add(CorporateCustomer customer) {
	// 	System.out.println(customer.id + " added.");
	// }
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
	
}

