package Entities;

import Abstract.Entities;
import java.util.Date;

public class Customer implements Entities {
	
	private int id;
    private String firstname;
    private String lastname;
    private Date birthOfDate;
    private String nationalityId;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public Customer(){
    	
    }

	public Customer(int id, String firstname, String lastname, Date birthOfDate, String nationalityId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthOfDate = birthOfDate;
		this.nationalityId = nationalityId;
	}

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		
	}
      
}
