package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {


	@Override
	public boolean ChekIfRealPerson(Customer customer) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
