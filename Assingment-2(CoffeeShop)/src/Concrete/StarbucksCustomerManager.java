package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService; 
	
	
	@Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.ChekIfRealPerson(customer)) {
			System.out.println("Saved to DB: " + customer.getFirstname());	
			// base.Save(customer);
		} else {
			throw new Exception("Not a valid person");
		}
	
		
	}


}
