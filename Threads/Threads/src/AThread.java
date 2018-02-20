
public class AThread extends Thread {
	BThread b = new BThread();
	public void run() {
		for(int i = 0; i < 100; i++) {
			
			System.out.println("a"+i);
		}
	}
}
