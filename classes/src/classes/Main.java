package classes;

public class Main {

	public static void main(String[] args) {
		// classes are reference type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Delete();
		customerManager.Read();
		customerManager.Update();
	}
	
}