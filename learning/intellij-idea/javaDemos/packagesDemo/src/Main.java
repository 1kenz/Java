// built-in
// import mathemathics.Calculates;
// import mathemathics.Logarithm;

import mathemathics.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*
    	Scanner scanner = new Scanner (System.in);

	    System.out.println ( "Enter your Name: " );

	    String name = scanner.nextLine ();
	    System.out.println ( "Hello " + name );
	     */

		Calculates calculates = new Calculates ();
		calculates.summary (1,5,7,9);
		Logarithm logarithm = new Logarithm ();
		logarithm.calculateLogarithm ();

    }
}
