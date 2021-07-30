package com.springdemo;

public class OracleCustomerDal implements ICustomerDal {

	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	// Data Access Layer
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("Added to Oracle.");
	}
}
