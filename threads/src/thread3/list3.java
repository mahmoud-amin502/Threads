package thread3;

public class list3 {
	public static void main(String args[]){
	Thread t1=new Thread(new Runnable() {
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
	});
	
	
	t1.start();
	
	}
	
	

}
