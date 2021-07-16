package inheritace;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ken = new IndividualCustomer();
		ken.id = 123;
		
		CorporateCustomer dnzsec = new CorporateCustomer();
		dnzsec.id = 111;
		
		UnionCustomer abc = new UnionCustomer();
		abc.id = 511;
		
		CustomerManager customerManager = new CustomerManager();
		// customerManager.add(dnzsec);
		// customerManager.add(ken);
		// customerManager.add(abc);
		
		
		// polymorphism
		Customer[] customers = { ken, dnzsec, abc};
		customerManager.addMultiple(customers);
		
	}

}
