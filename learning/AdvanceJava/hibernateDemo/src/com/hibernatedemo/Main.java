package com.hibernatedemo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		// Unit of work design pattern
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			// HQL --> Hibernate Query Language
			// Select * from city
			// from City c where c.countryCode='TUR' AND c.countryCode='USA'
			// from City c where c.name LIKE '%stan%'
			// ASC-Ascending
			// DESC-Descending
			
			/*
			 * List<String> countryCodes =
			 * session.createQuery("select c.countryCode from City c GROUP BY c.countryCode"
			 * ).getResultList();
			 * 
			 * for(String countryCode : countryCodes) { System.out.println(countryCode); }
			 */
			// CRUD
			
			// INSERT
			/*
			 * City city = new City(); city.setName("Düzce Hibernate");
			 * city.setCountryCode("TUR"); city.setDistrict("Düzce");
			 * city.setPopulation(99999);
			 * 
			 * session.save(city);
			 */
			
			
			// UPDATE
			/*
			 * City city = session.get(City.class, 4087); //
			 * System.out.println(city.getName()); city.setPopulation(111111);
			 * 
			 * session.save(city);
			 */
			
			
			// DELETE
			City city = session.get(City.class, 4087);
			session.delete(city);
			
			session.getTransaction().commit();
			
			System.out.println("City deleted.");
			
		} finally {
			factory.close();
		}
	}

}
