import java.util.Date;
import java.util.Objects;
public class Employe extends Person {
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	
	public Employe() {
		super();
		this.salary = 100;
		this.hireDate = null;
		this.insuranceNumber = "unknown";
	}
	
	public Employe(String name, double salary, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = new Date();
		this.insuranceNumber = insuranceNumber;
	}
	
	
	public void setSalary(double salary) {this.salary = salary;}
	public double getSalary() {return this.salary;}
	
	public Date getDate() {return this.hireDate;}
	public void setInsuranceNumber(String insuranceNumber) {this.insuranceNumber = insuranceNumber;}
	public String getInsuranceNumber() {return this.insuranceNumber;}
	
	public boolean equals(Object other) {
		if(other == null) return false;
		if(this == other) return true;
		if(!(other instanceof Person)) return false;
			
		Employe e = (Employe)other;
		
		if(super.equals(other) && this.salary == e.getSalary() && this.hireDate.equals(e.getDate())) return true;
		else return false;
		
	}
	
	public int compareTo(Object other) {
		Employe e = (Employe)other;
		if(super.compareTo(other) == 0) {
			if(this.salary < e.getSalary()) return -1;
			else if(this.salary > e.getSalary()) return 1;
			else {
				return this.insuranceNumber.compareTo(e.insuranceNumber);
			}
		}
		else return super.compareTo(other);
	}
	
	public int hashCode() {
		return Objects.hash(this.getName(), this.salary, this.hireDate, this.insuranceNumber);
	}
	
	public String toString() {
		return super.toString() + "\nEmployee {\nSalary: " + this.salary + "\nDate: " + this.hireDate.toString() + "\nInsurance number: " + this.insuranceNumber + "\n}";
	}
	
	public Employe clone() throws CloneNotSupportedException {
		Employe e = (Employe)super.clone();
		
		e.insuranceNumber = this.insuranceNumber;
		e.salary = this.salary;
		e.hireDate = (Date)this.hireDate.clone();
		
		return e;
		
	}
	
	
}
