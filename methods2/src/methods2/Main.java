package methods2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		String message = "Today wheather is very beautiful.";
	
		System.out.println(message);
	
		String newMessage = city();
		
		System.out.println(newMessage);
		
		int number = add(5,7);
		System.out.println(number);

		int number2 = minus(5,7,9);
		System.out.println(number2);
		
		create();
		read();
		update();
		delete();
		add(5,9);
		city();
	}
	
	// CRUD
	// VOID : no a value returned.
	public static void create() {
		System.out.println("Create new data !");
	}
	
	public static void read() {
		System.out.println("Read data !");
	}
	
	public static void update() {
		System.out.println("Update data !");
	}
	
	public static void delete() {
		System.out.println("Delete data !");
	}
	
	public static int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int minus(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total -= number;
		}
		return total;
	}
	
	public static String city() {
		return "İstanbul";
	}

}
