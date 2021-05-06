package interfacesDemo;

public class CustomerManager {
	
	ICustomerDal customerDal;
	
	public void add() {
		// business
		customerDal.Add();
	}
}
