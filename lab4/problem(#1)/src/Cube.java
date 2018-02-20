import java.util.*;
public class Cube implements Shape3D {
	private double edge;
	
	public Cube() {	}
	public Cube(double edge) {
		this.edge = edge;
	}
	
	public void setRadius(double radius) {this.edge = edge;}
	public double getRadius() {return this.edge;}
	
	@Override
	public double volume() {
		return Math.pow(edge, 3);
		
	}

	@Override
	public double surfaceArea() {
		return Math.pow(edge, 2);
	}
	
	public String toString() {
		return "Volume: " + this.volume() + "\nArea: " + this.surfaceArea(); 
	}

}
