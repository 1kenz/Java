public class Main {

    public static void main(String[] args) {
       //  ICustomerDal customerDal = new OracleCustomerDal ();
       // customerDal.Add ();

        // polymorphism with interfaces
        CustomerManager customerManager = new CustomerManager (new OracleCustomerDal ());
        // customerManager.customerDal = new OracleCustomerDal ();
        // customerManager.customerDal = new MySqlCustomerDal ();
        customerManager.add ();
    }
}
