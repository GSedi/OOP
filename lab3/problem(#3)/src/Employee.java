
public class Employee extends Person {
	private double salary;
	private int year;
	private String insuranceNumber;
	
	
	public Employee() {
		super();
		this.salary = 100;
		this.year = 0;
		this.insuranceNumber = "unknown";
	}
	
	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	
	public void setSalary(double salary) {this.salary = salary;}
	public double getSalary() {return this.salary;}
	public void setYear(int year) {this.year = year;}
	public int getYear() {return this.year;}
	public void setInsuranceNumber(String insuranceNumber) {this.insuranceNumber = insuranceNumber;}
	public String getInsuranceNumber() {return this.insuranceNumber;}
	
	public boolean equals(Employee e) {
		return (super.equals(e) && this.salary == e.salary && this.year == e.year && this.insuranceNumber == e.insuranceNumber);
		
	}
	
	public String toString() {
		return super.toString() + "\nEmployee {\nSalary: " + this.salary + "\nYear: " + this.year + "\nInsurance number: " + this.insuranceNumber + "\n}";
	}
	
}
