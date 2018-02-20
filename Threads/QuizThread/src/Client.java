import java.util.concurrent.Semaphore;

public class Client extends Thread {
	 volatile static boolean barberIsSleep = true;
	
	public void run() {
		System.out.println("Client " + Thread.currentThread().getName() + " come to barber");
		checkBarber();
		barberWork();
		
		
	}
	public synchronized void checkBarber() {
		if(barberIsSleep) {
			System.out.println("Barber is sleeping");
			barberIsSleep = false;
			System.out.println("Barber is wake up and start to work with client " + Thread.currentThread().getName());
		
		}
	}
	public synchronized void barberWork() {
		try {
			Main.sem.acquire();
			
				System.out.println("Barber is working with client " + Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("Barber is done to work with client " + Thread.currentThread().getName());
				Main.sem.release();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
			
}
