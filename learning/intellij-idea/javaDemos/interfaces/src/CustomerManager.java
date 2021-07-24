public class CustomerManager {
    // Strategy pattern
   private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        // business logic
        customerDal.Add ();

    }
}
