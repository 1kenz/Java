import Abstract.BaseCustomerManager;
// import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Throwable {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager();
		customerManager.save(new Customer(1,"Ken", "Den", 1982, "12345678901"));

	}

}
