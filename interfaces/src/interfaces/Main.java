package interfaces;

public class Main {

	public static void main(String[] args) {
		// CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		// CustomerManager customerManager = new CustomerManager(new SmsLogger());
		CustomerManager customerManager = new CustomerManager(new EmailLogger());

		
		Customer ken = new Customer(1, "ken", "den");
		
		customerManager.add(ken);
	}

}
