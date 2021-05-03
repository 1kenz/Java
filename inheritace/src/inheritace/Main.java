package inheritace;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ken = new IndividualCustomer();
		ken.id = 123;
		
		CorporateCustomer dnzsec = new CorporateCustomer();
		dnzsec.id = 111;
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(dnzsec);
		customerManager.add(ken);
		
	}

}
