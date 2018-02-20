
public class Employee extends Person {
	public Employee() {}
	
	public Employee(String name) {
		
		super(name);
	}
	public String getName() {
		System.out.println("Employee Name: " + this.name);
		return name;
		}
}
