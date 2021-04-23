package miniProjectPrimeNumber;

public class Main {
    public static void main(String[] args) {
        int number = 55;
        int remain = number % 2;
        // System.out.println(remain);
        boolean isPrime = true;

        if(number == 1){
            System.out.println(number + " is NOT a Prime Number !!!");
         
        } else if(number<1){
            System.out.println(number + " is NOT Valid Number !!!");
         
        } else {
            for(int i=2; i<number; i++){
                if(remain == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a Prime Number !!!");
            } else {
                System.out.println(number + " is NOT a Prime Number !!!");
            }
        }
    }
}
