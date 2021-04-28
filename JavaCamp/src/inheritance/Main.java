package inheritance;

public class Main {
    

    public static void main(String[] args) {
        
        IndividualCustomer ken = new IndividualCustomer();
        ken.customerNumber = "1";
       


        CorporateCustomer dnzsec = new CorporateCustomer();
        dnzsec.customerNumber = "13";

        // CustomerManager customerManager = new CustomerManager();
        // customerManager.add(ken);
        // customerManager.add(dnzsec);
        CustomerManager customerManager = new CustomerManager();
        
        Customer[] customers = {ken, dnzsec};

        customerManager.addMultiple(customers);

    }

}
