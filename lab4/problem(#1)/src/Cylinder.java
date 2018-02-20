
public class Cylinder implements Shape3D {
	private double height;
	private double radius;
	public Cylinder() {}
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return this.radius;}
	public void setHeight(double height) {this.height = height;}
	public double getHeight() {return this.height;}
	
	@Override
	public double volume() {
		return this.height*Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double surfaceArea() {
		
		return 2*Math.PI*radius*height;
	}

	public String toString() {
		return "Volume: " + this.volume() + "\nArea: " + this.surfaceArea(); 
	}
}
