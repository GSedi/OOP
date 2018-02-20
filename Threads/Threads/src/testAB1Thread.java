
public class testAB1Thread {

	public static void main(String[] args) {
		AThread a = new AThread();
		BThread b = new BThread();
		Thread1 t_1 = new Thread1();
		
		a.start();
		

		b.start();
		
			
		
		t_1.start();
	}

}
