package methods;

public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1,2,3,7,5,9};
        int findNumber = 4;
        boolean isExist = false;

        for (int number : numbers) {
            if(number == findNumber){
                isExist = true;
                break;
            } 
        }
        if(isExist){
            message("Number is existed");
        } else {
            message("Number is NOT existed");
        }
    }
    
    public static void message(String message) {
        System.out.println(message);
    }
}
