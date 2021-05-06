package interfacesDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		// customerManager.customerDal = new OracleCustomerDal();
		// customerManager.customerDal = new MsSqlCustomerDal();
		customerManager.add();
		

	}

}
