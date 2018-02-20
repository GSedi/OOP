import java.util.concurrent.Semaphore;

public class Main {
	static Semaphore sem = new Semaphore(1);
	public static void main(String[] args) {
		
			ThreadGroup group = new ThreadGroup("group");  
	        Thread []t = new Thread[11];
			for(int i=1; i<t.length; i++) {
				t[i] = new Thread(group, new Client()); 
				t[i].setName("client+" + i);
				t[i].start();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			boolean done = false;
			while(!done)  
			{      
				//System.out.print("\n" +group.activeCount());
				//Estimate number of active threads in the thread group  
				if (group.activeCount() == 0)  
				{  
					done = true;  
				}  
			} 
			 
			System.out.print("Barber again get sleep");
		}

	

}
