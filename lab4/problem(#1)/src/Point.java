
public class Point implements Shape3D{
	private int x,y,z;
	public Point() {}
	
	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	
	public double volume() {return 0;}
	public double surfaceArea() {return 0;}
	
	public void move(int dx, int dy, int dz) {
		this.x += dx;
		this.y += dy;
		this.z += dz;
	}
	
	public String toString() {
		return "X: " + this.x +"\nY: " + this.y +"\nZ: " + this.z;
	}
	
	
}
