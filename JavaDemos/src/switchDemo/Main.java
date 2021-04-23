package switchDemo;

public class Main {
    
    public static void main(String[] args) {
        
        char grade = 'z';

        switch (grade) {
            case 'A':
                System.out.println("Perfect: You are passed");
                break;
            case 'B':
                System.out.println("Very Good: You are passed");
                break;
            case 'C':
                System.out.println("Good: You are passed");
                break;
            case 'D':
                System.out.println("Not Bad: You are passed");
                break;
            case 'F':
                System.out.println("You are failed");
                break;

            default:
                System.out.println("It is not valid !!");
                break;
        }
    }
}
