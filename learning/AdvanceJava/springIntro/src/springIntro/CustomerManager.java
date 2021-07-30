package springIntro;

public class CustomerManager implements ICustomerService {
	
	// dependency injection
	private ICustomerDal customerDal;
	
	// constructor injection *** preferred
	// public CustomerManager(ICustomerDal customerDal) {
	// 	this.customerDal = customerDal;
	// }
	
	// setter injection -- not preferred
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// business logic
		
		// CustomerDal customerDal = new CustomerDal();
		customerDal.add();
		
		
	}

}
