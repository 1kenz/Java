package methods2;


public class Main {
    public static void main(String[] args) {
        // String message = "Weather is very good today";
        // String newMessage = message.substring(0,2);
        String newMessage = getCity();
        System.out.println(newMessage);
        int number = multiply(5,7);
        System.out.println(number);
        System.out.println(adding(1,5,9,15,88));
        
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static String getCity() {
        return "İstanbul";
    }

    public static int adding(int... numbers) {  // variables arguments like JS Destructuring assignment ...numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
