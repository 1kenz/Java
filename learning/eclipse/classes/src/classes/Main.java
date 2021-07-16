package classes;

public class Main {

	public static void main(String[] args) {
		// classes are reference type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Delete();
		customerManager.Read();
		customerManager.Update();
	
		// primitive types - value -- stack
		int number1 = 10;
		int number2 = 25;
		number2 = number1;
		number1 = 55;
		System.out.println(number2);
		
		// reference types -- stack -- heap (reference)
		int[] numbers3 = {1,2,3,5};
		int[] numbers4 = new int[] {5,7,9,11};
		numbers4 = numbers3;
		numbers3[1] = 15;
		System.out.println(numbers4[1]);
	}
}