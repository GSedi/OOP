import java.util.*;
import java.io.Serializable;
public class Instructor implements Serializable, Cloneable{
	private String firstName, lastName, department, email;
	public Instructor() {
		this.firstName = "unknown";
		this.lastName = "unknown";
		this.department = "unknown";
		this.email = "unknown";
	}
	
	public Instructor(String firstName, String lastName, String department, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}
	
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public void setDepartment(String department) {this.department = department;}
	public void setEmail(String email) {this.email = email;}
	
	public String getFirstname() {return this.firstName;}
	public String getLastName() {return this.lastName;}
	public String getDepartment() {return this.department;}
	public String getEmail() {return this.email;}
	
	public boolean equals(Object other) {
		if(other == null) return false;
		if(this == other) return true;
		if(!(other instanceof Instructor)) return false;
		
		Instructor ins = (Instructor)other;
		
		if(this.firstName.equals(ins.firstName) && this.lastName.equals(ins.lastName) && this.department.equals(ins.department) && this.email.equals(ins.email)) return true;
		else return false;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Instructor ins = new Instructor();
		ins.firstName = this.firstName;
		ins.lastName = this.lastName;
		ins.department = this.department;
		ins.email = this.email;
		return ins;
		
	}
	
	public String toString() {
		return "\nInstructor{\nFirst name: " + this.firstName + "\nLast name: " + this.lastName + "\nDepartment: " + this.department + "\nEmail: " + this.email + "\n}";
	}
	
}
