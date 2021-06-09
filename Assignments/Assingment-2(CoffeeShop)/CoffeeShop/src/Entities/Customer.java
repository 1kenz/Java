package Entities;
import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	public int Id;
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	public String nationalityId;
}
