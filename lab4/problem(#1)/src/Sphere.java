import java.util.*;
public class Sphere implements Shape3D {
	private double radius;
	public Sphere() {}
	public Sphere(double radius) {this.radius = radius;}
	
	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return this.radius;}
	

	public double volume() {
		return (4*Math.PI*Math.pow(radius, 3))/3;
	}

	public double surfaceArea() {
		return 4*Math.PI*Math.pow(radius, 2);
	}

	public String toString() {
		return "Volume: " + this.volume() + "\nArea: " + this.surfaceArea(); 
	}
}
