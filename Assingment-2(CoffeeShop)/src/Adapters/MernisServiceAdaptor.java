package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService{

	@Override
	public boolean ChekIfRealPerson(Customer customer) throws RemoteException {
	
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(Convert.long(customer.getNationalityId()), customer.getFirstname().toUpperCase(), customer.getLastname().toUpperCase(), customer.getBirthOfDate());
		
	}
	
}
