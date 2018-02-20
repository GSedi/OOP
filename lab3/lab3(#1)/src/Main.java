import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal animal = new Animal();
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		int age = scan.nextInt();
		String sound = scan.next();
		
		dog = new Dog(name, age, sound);
		
		dog.setAge(15);
		
		System.out.println(dog.toString());
		System.out.println(dog.eat());
		System.out.println(animal.eat());
		
		scan.close();
	}

}
