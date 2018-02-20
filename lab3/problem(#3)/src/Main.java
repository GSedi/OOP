
public class Main {

	public static void main(String[] args) {
		Person p = new Person("asdsd");
		Person p2 = new Person("asdsd");
		Manager p3 = new Manager("ASD", 12.5, 5, "1q1q1q", 0.5);
		Manager p4 = new Manager("ASD", 12.5, 5, "1q1q1q", 0.5);
		
		Employee e = new Employee("vbvbb", 42.5, 7, "rfrfrfrr");
		Employee e1 = new Employee("bbbbbbbbb", 45, 12, "hyhhyhhy");
		p4.addEmployee(e);
		p4.addEmployee(e1);
		if(p4.equals(p3)) {System.out.println("efewfwerfwefewef");}
		else System.out.println(".............");
		
		System.out.println(p4.toString());
	}

}
