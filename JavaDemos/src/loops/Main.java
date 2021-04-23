package loops;

public class Main {
    
    public static void main(String[] args) {
        
        // for loop
        for (int i=1; i<10; i+=2) {
            System.out.println(i);
        }
            System.out.println("-------------End of For Loop!!!-------------");
            
        // While loop
        int i = 1;
        while(i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------------End of While Loop!!!-------------");

        // do-while loop
        int j = 1;
        do{
            System.out.println("Loglandı");
            System.out.println(j);
            j+=2;

        }while(j<10);
        System.out.println("-------------End of Do-While Loop!!!-------------");


        }
    }
