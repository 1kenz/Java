package inheritance;

public class CustomerManager {
    // Polymorphism
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " saved.");
    }

    // bulk insert
    public void addMultiple(Customer[] customers) {
        for(Customer customer: customers) {
            add(customer);
        }
    }
}
