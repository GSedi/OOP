import java.util.Objects;

public class Person implements Comparable, Cloneable {
	private String name;
	
	public Person() {this.name = "Unknown";}
	public Person(String name) {this.name = name;}
	
	public void setName(String name) {this.name =name;}
	public String getName() {return this.name;}
	
	public boolean equals(Object other) {
		
		if(other == null) return false;
		if(this == other) return true;
		if(!(other instanceof Person)) return false;
			
		Person p = (Person)other;
		
		if(this.name.equals(p.getName())) return true; 
		else return false;
			
	}
	
	public int compareTo(Object other) {
		Person person = (Person)other;
		return this.name.compareTo(person.name);
	}
	
	public int hashCode() {
		return Objects.hash(this.name);
	}
	public String toString() {
		return "Person {\nName: " + this.name + "\n}";
	}
	
	public Person clone() throws CloneNotSupportedException {
		return (Person)super.clone();
		
	}

}
