package Interface;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog("White");
		Dog d2 = new Dog("White");
		
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.toString());
		
		Car c1 = new Car("Blue");
		Car c2 = new Car("Blue");
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.toString());

	}

}
