
public class Dog extends Animal {
	String sound;
	
	public Dog() {
		super();
		this.sound = "unknown";
	}
	
	public Dog(String name, int age, String sound) {
		super(name, age*7);
		this.sound = sound;
	}
	
	public String eat() {
		return "The dog is omnivorous";
	}
	
	public void setSound(String sound) {this.sound = sound;}
	
	public String getSound() {return this.sound;}
	
	public String toString() {
		return super.toString() + "\n" +"Sound: " + this.sound; 
	}
	
}
