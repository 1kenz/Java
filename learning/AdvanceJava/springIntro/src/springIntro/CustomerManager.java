package springIntro;

public class CustomerManager implements ICustomerService {
	
	// dependency injection
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		// business logic
		
		// CustomerDal customerDal = new CustomerDal();
		
		
	}

}
