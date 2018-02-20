import java.util.Scanner;
public class NavigationExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		menu : while(true){
			System.out.println("Hello! What do you want to do?");
			System.out.println("\n 1) Eat \n 2) Drink  \n 3) Exit");
			int choice = in.nextInt();
			if(choice==1){
				eating: while(true){
					System.out.println("Eating....");
					System.out.println("\n 1) Eat more  \n 2) Return back \n 3) Exit");
					choice = in.nextInt();
					if(choice==1) continue eating;
					if(choice==2) continue menu;
					if(choice==3) {System.out.println("Bye!!!"); break menu;}
					break;
				}
			}
			else if (choice==2){
				drinking: while(true){
					System.out.println("Drinking....");
					System.out.println("\n 1) Drink more  \n 2) Return back \n 3) Exit");
					choice = in.nextInt();
					if(choice==1) continue drinking;
					if(choice==2) continue menu;
					if(choice==3) {System.out.println("Bye!!!"); break menu;}
					break;
				}
			}
			else if (choice==3){
				System.out.println("Bye!!!"); break menu;
				//or System.exit(0);
			}
		}
	}
}
