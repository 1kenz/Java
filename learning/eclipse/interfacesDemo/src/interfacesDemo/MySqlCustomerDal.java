package interfacesDemo;

// public class MySqlCustomerDal extends className implements ICustomerDal, IRepository {

public class MySqlCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void Add() {
		System.out.println("Added to MySql...");
		
	}

}
