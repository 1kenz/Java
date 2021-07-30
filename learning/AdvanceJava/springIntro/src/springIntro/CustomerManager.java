package springIntro;

public class CustomerManager {
	
	// dependency injection
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		// business logic
		
		// CustomerDal customerDal = new CustomerDal();
		
		customerDal.add();
	}

}
