public class Main {

    public static void main(String[] args) {
	    char grade = 'D';

	    switch (grade){
            case 'A':
                System.out.println("Perfect");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Normal");
                break;
            case 'D':
                System.out.println("Enough");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Please input correct grade");

        }
    }
}
