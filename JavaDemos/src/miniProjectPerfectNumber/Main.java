package miniProjectPerfectNumber;

public class Main {
    public static void main(String[] args) {
        
        int number = 55;
        int total = 0;

        for(int i=1; i<number; i++){
            if(number % i == 0){
                total = total + i;
            }
        }

        if(total == number){
            System.out.println("This is a perfect number");
        } else {
        System.out.println("This is NOT a perfect number");
        }



    }
}
