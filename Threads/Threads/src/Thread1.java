
public class Thread1 extends Thread{
	BThread b = new BThread();
	public void run() {
		
		for(int i = 1; i <= 100; i++) {
			try {
				b.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}
