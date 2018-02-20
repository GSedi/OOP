
public class Car implements AverageSpeedMove{
	private int speed;
	
	public Car() {}
	public Car(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void move() {
		this.speed+=15;
	}
}
