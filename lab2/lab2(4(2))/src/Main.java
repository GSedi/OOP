import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int[] n = new int[3];
		int[] m = new int[3];
		System.out.println("Enter the time at hh:mm:ss format..");
		for(int i = 0; i < 3; i++) {
			if(num.hasNextInt()) {
				n[i] = num.nextInt();
			}
			else {
				System.out.println("ERROR: Invalid input!!! \nThe input can be only integer numbers!");
				break;
			}
				
		}
		Time first = new Time();
		
		if((n[0] < 24 && n[0] >= 0) && (n[1] >= 0 && n[1] < 60) && (n[2] >= 0 && n[2] < 60)) {
			
		
		 Time t = new Time(n[0], n[1], n[2]);
		first = t;
		System.out.println("Universal: " + t.Universal());
		System.out.println("Standard:  " + t.Standard());
		}
		else {
			System.out.println("ERROR: Invalid input!!!");
		}
		
		System.out.println("Do you want to add time yes/no?");
		String a = num.next();
		if(a.equals("yes")) {
			for(int i = 0; i < 3; i++) {
				if(num.hasNextInt()) {
					m[i] = num.nextInt();
				}
				else {
					System.out.println("ERROR: Invalid input!!! \nThe input can be only integer numbers!");
					break;
				}
					
			}
			
			if((m[0] < 24 && m[0] >= 0) && (m[1] >= 0 && m[1] < 60) && (m[2] >= 0 && m[2] < 60)) {
				Time t2 = new Time(m[0], m[1], m[2]);
				
				Time sum = new Time();
				sum = first.add(t2);
				
				System.out.println("Universal: " + sum.Universal());
				System.out.println("Standard:  " + sum.Standard());
				
			}
			else {
				System.out.println("ERROR: Invalid input!!!");
			}
			
			
			
			
		}else {return;}
		
		
		
		num.close();
	}

}
