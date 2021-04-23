package recapDemo1;

public class Main {
    
    public static void main(String[] args) {
        
        int number1 = 5;
        int number2 = 55;
        int number3 = 21;
        int bigger = number1;

        if (bigger < number2){
            bigger = number2;
        } else if (bigger < number3) {
            bigger = number3;
        }

        System.out.println("Bigger Number is :" + " " + bigger);

    }
}
