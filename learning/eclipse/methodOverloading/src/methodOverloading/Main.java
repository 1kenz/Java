package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(5, 11));
		System.out.println(calculator.add(5, 11,22));

	}

}
