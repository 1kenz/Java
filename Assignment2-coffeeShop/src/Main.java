import java.util.Date;

import Abstract.BaseCustomerManager;
import Concretes.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "kenan", "deniz", new Date(1982,9,21), "57016417506"));

	}

}
