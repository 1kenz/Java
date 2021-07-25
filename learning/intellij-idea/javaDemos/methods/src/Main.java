public class Main {

    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber(){
        int[] numbers = new int[]{1,2,3,4,5};
        int find = 7;
        boolean isExist = false;

        for (int number: numbers){
            if (number==find){
                isExist = true;
                break;
            }

        }
        String message ="";

        if (isExist){
            // System.out.println("This number is exist." + find);
            message = "This number is exist: " + find;
            message(message);
        } else {
            // System.out.println("This number is not exist." + find);
            message = "This number is not exist: " + find;
            message(message);
        }
    }
    // methods define camelCase
    public static void message(String message){
        System.out.println(message);
    }
}
