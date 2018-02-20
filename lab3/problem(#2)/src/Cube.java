
public class Cube extends Shapes3D {
	public double edge;
	
	public Cube() {}
	
	public Cube(double edge) {this.edge = edge;}
	
	public void setEdge(double edge) {this.edge = edge;}
	public double getEdge() {return this.edge;}
	
	public void  volume() {
		this.volume = Math.pow(edge, 3);
	}
	public void surfaceArea() {
		this.area = 6*Math.pow(edge, 2);
	}
	
	
	public double getVolume() {return this.volume;}
	public double getArea() {return this.area; }
	
	public String toString() {return "Volume: " + this.volume + "\nArea: " + this.area; }
	
}
