
public class Animal {
	private String name;
	private int age;
	
	
	public Animal() {
		name = "noName";
		age = 0;
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String eat() {
		return "This animal is vegeterian";
	}
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	
	public void setName(String name) {	this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setAge() {this.age *= 7;}
	
	public String toString() {
		return "Name: " +this.name + "\n" +  "Age: " +this.age;
	}
}
