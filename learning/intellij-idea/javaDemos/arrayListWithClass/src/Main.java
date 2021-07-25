import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer> ();
        Customer ken = new Customer ( 1, "Ken","Den");
        customers.add (ken);  // if manipulate values of object use a variable ***
        //customers.add (new Customer ( 1, "Ken","Den" ));
        customers.add (new Customer ( 2, "Ker","Den" ));
        customers.add (new Customer ( 3, "Mer","Den" ));

        customers.remove (ken);
        customers.remove (new Customer ( 2, "Ker","Den" ));  // does not work

        for (Customer customer: customers){
            System.out.println ( customer.getFirstName () );
        }
    }
}
