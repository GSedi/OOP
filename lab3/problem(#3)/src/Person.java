
public class Person {
	private String name;
	
	public Person() {this.name = "Unknown";}
	public Person(String name) {this.name = name;}
	
	public void setName(String name) {this.name =name;}
	public String getName() {return this.name;}
	
	public boolean equals(Person p) {
		
			if(this.name.equals(p.name)) return true; 
			else return false;
			
	}
	
	public String toString() {
		return "Person {\nName: " + this.name + "\n}";
	}
}
