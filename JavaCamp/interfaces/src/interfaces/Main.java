package interfaces;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		Customer ken = new Customer(1,"ken","Den");
		customerManager.add(ken);

	}

}
