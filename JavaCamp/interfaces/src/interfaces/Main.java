package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer ken = new Customer(1,"ken","Den");
		
		customerManager.add(ken);

	}

}
