import java.time.LocalDate;

import Abstract.BaseCustomerManager;
// import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Kenan","Deniz",LocalDate.of(1982, 09, 21),"111111"));

	}

}