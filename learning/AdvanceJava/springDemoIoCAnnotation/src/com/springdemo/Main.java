package com.springdemo;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext(IocConfig.class);
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		
		// CustomerManager manager = new CustomerManager(new CustomerDal());,		CustomerManager manager = new CustomerManager(new CustomerDal());
		// CustomerManager manager = new CustomerManager(new MySqlDal());
		// CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
	
		// manager.add();
		
		customerService.add();

	}
	
	// IoC - Inversion of Control
	// Dependency Injection
	// Spaghetti
	// SOLID -
	
	
	
}
