package miniProjectFindNumber;

public class Main {
    public static void main(String[] args) {
        
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
            System.out.println("Number is existed");
        } else {

            System.out.println("Number is NOT existed");
        }




    }
}
