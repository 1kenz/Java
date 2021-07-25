import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	   /*
	    int[] numbers = new int[]{1,2,3};
	    // numbers[3] = 5;
        numbers = new int[4];  // create new array changes it is reference
        System.out.println ( numbers[0] );  // 0,0,0,0
        System.out.println ( numbers );  // 0,0,0,0

	    */

        ArrayList numbers = new ArrayList (  );
        numbers.add (1);
        numbers.add (7);
        numbers.add ("İstanbul");
        /*
        System.out.println ( numbers.size () );
        System.out.println ( numbers );
        System.out.println ( numbers.get (2) );
        numbers.set (1,77);
        System.out.println ( numbers );
        numbers.remove (1);
        System.out.println ( numbers );
        numbers.clear ();
        System.out.println ( numbers );

         */

        for (Object number: numbers){
            System.out.println ( number );
        }



    }
}
