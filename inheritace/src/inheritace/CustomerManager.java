package inheritace;

public class CustomerManager {
	public void add(IndividualCustomer customer) {
		System.out.println(customer.id + " added.");
	}
	
	public void add(CorporateCustomer customer) {
		System.out.println(customer.id + " added.");
	}
}

