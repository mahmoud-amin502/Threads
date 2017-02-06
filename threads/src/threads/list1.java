package threads;

class myclass extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getId()+"     "+"vslue"+i);
		}
	}
	
}



public class list1 {
	public static void main(String args[]){
	myclass s1=new myclass();
	myclass s2=new myclass();
	s1.start(); //.start() : creates a thread randomly and call the function run at the thread class i implemented 
	s2.start();
	
	// 2 threads running concurrently 
	
	
	
	
	
	
	
	}

}
