package Interface;

public class Dog implements Comparable {
	private String color;

	public Dog(String color) {
		
		this.color = color;
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	public int compareTo(Object other) {
		Dog d = (Dog)other;
		return this.color.compareTo(d.color);
	}
	
	public String toString() {
		return this.color;
	}
	
}
