public class Main {

    public static void main(String[] args) {
	    Calculate calculate = new Calculate();
	    int result1 = calculate.Plus(5,6,88,22);
		int result2 = calculate.Minus(66,99,11,1);
		int result3 = calculate.Multiply(44,55);
		float result4 = calculate.Divide(55,11);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
    }
}
