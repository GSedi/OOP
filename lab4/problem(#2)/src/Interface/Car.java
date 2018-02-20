package Interface;

public class Car implements Comparable{
	private String color;

	public Car(String color) {
		
		this.color = color;
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	public int compareTo(Object other) {
		Car c = (Car)other;
		return this.color.compareTo(c.color);
	}
	
	public String toString() {
		return this.color;
	}
}
