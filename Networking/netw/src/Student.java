
import java.io.Serializable;
public class Student implements Serializable{
	String name;
	String id;
	double gpa;
	public Student(String name, String id, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
