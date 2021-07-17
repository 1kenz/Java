public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();  // create an instance
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int number1 = 11;
        int number2 = 22;
        number2 = number1;
        number1 = 33;
        System.out.println("Number 1 is : " +number1);
        System.out.println("Number 2 is : " + number2);

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 7;
        System.out.println(numbers2[0]);
        System.out.println(numbers1[0]);

    }

}
