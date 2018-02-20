
public class Cylinder extends Shapes3D {
	private double radius;
	private double height;
	
	public Cylinder() {}
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return this.radius;}
	public void setHeight(double height) {this.height = height;}
	public double getHeight() {return this.height;}
	
	
	public void volume() {
		this.volume = this.height*Math.PI*Math.pow(radius, 2);
	}
	public void surfaceArea() {
		this.area = 2*Math.PI*radius*height;
	}
	
	public double getVolume() {return this.volume;}
	public double getArea() {return this.area; }
	
	public String toString() {return "Volume: " + this.volume + "\nArea: " + this.area; }
	
	
}
