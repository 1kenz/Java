import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdaptor;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		// BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		customerManager.save(new Customer(1, "kenan", "deniz", new Date(1980-1-01), "12345678901"));
		System.out.println();
	}

}
