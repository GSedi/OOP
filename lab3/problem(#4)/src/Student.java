
public class Student extends Person {
	public Student() {}
	
	public Student(String name) {
		super(name);
	}
	
	public String getName() {
		System.out.println("Student Name: " + this.name);
		return name;
		}
}
