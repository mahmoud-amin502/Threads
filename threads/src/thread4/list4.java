package thread4;

public class list4 {
	private static int cont = 0;
	
	
	
	
	
	
	public static synchronized void incont(){ //only accessed by only one thread at a time
		cont++;
	}
	
	
	
	
	

	public static void main(String args[]) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10000; i++) {
					incont();

				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10000; i++) {
					incont();

				}

			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		
		
		System.out.println(cont);
		
		

	}

}
