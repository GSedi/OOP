import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Sphere s = new Sphere(scan.nextInt());
		Cylinder c = new Cylinder(scan.nextInt(),scan.nextInt());
		Cube cube = new Cube(scan.nextInt());
		s.volume();
		s.surfaceArea();
		c.volume();
		c.surfaceArea();
		cube.volume();
		cube.surfaceArea();
		System.out.print(s.toString() + "\n");
		System.out.print(c.toString()+ "\n");
		System.out.print(cube.toString()+ "\n");
		
		
		
		scan.close();
	}

}
