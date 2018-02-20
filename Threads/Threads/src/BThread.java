
public class BThread extends Thread{
	Thread1 t_1 = new Thread1();
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			
			System.out.println("b"+i);
			
		}
	}
}
