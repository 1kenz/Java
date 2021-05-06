package interfacesDemo;

public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void Add() {
		System.out.println("Added to MS Sql...");
		
	}

}
