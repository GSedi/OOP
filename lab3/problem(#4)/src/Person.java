
public class Person {
	public String name = "Person";
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {return "Person Name: " + name;}
}
