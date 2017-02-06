package thread2;

//

class myclass implements Runnable{

	
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getId()+"     "+"vslue : "+i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


public class list2 {
	public static void main(String args[]){
		Thread t1=new Thread(new myclass());
		Thread t2=new Thread(new myclass());
		t1.start();
		t2.start();
	}

}
