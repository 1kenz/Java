package com.springdemo;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.*;

@Configurable
@ComponentScan("com.springdemo")
public class IocConfig {
	@JavaBean
	public ICustomerDal database() {
		return new MsSqlCustomerDal();
	}
	
}
