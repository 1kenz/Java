public class Main {

    public static void main(String[] args) {
	    int number1 = 555;
	    int number2 = 15;
	    int number3 = 77;

	    int biggerNumber = number1;

	    if (biggerNumber < number2){
	        biggerNumber = number2;
        }

	    if (biggerNumber < number3) {
	        biggerNumber = number3;
        }
	    System.out.println("Bigger number is " + biggerNumber);
    }
}
