import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       /*
        // ArrayList cities = new ArrayList ();  // create an Object not type safe
        ArrayList<String> cities = new ArrayList<String> (); // ArrayList generic class
        cities.add ("İstanbul");
        cities.add ("İzmir");
        // cities.add (7);  // can't use it because type safe now
        */
        /*
        MyList<String> cities = new MyList<> ();
        cities.add ("İstanbul");
        // cities.add (1);  // must be a String value
         */

        MyList<Customer> customer = new MyList<Customer> ();
        customer.add (new Customer ());




        // Customer
        // Product
        // Validator

    }
}
