public class Main {

    public static void main(String[] args) {
	    // operations-methods-functions
        String message = "Today is very beautiful day.";
        // String newMessage = message.substring(0,5);
        String newMessage = city();
        System.out.println(newMessage);
        int number = summary(5,7,9,122);
        System.out.println(number);

    }

    public static void add(){
        System.out.println("Added to DB.");
    }

    public static void delete(){
        System.out.println("Deleted to DB.");
    }

    public static void update(){
        System.out.println("Updated to DB.");
    }
    // variable arguments -- change an array
    public static int summary(int... numbers) {
        int summary = 0;
        for (int number: numbers){
            summary += number;
        }
        return summary;
    }

    public static String city(){
        return "İstanbul";
    }
}
