package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {

	boolean ChekIfRealPerson(Customer customer) throws RemoteException;
}
