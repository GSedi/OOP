
public class Main {

	public static void main(String[] args) {
		Student studentObj = new Student("Student");
		Employee employeeObj = new Employee("Employee");
		
		Person ref = studentObj;
		
		String temp = ref.getName();
		System.out.println(temp);
		
		ref = employeeObj;
		
		temp = ref.getName();
		System.out.println(temp);
	}

}
