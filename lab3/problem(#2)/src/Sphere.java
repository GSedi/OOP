import java.util.*;
public class Sphere extends Shapes3D {
	private double radius;
	
	
	
	public Sphere() {}
	public Sphere(double radius) {this.radius = radius;}
	
	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return this.radius;}
	
	
	public void volume() { this.volume =  (4/3)*Math.PI*Math.pow(radius, 3); }
	public void surfaceArea() { this.area = 4*Math.PI*Math.pow(radius, 2); }
	
	public double getVolume() {return this.volume;}
	public double getArea() {return this.area; }
	
	public String toString() {return "Volume: " + this.volume + "\nArea: " + this.area; }
	
}
