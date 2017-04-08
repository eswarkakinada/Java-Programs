package threads;



class MyClass1 extends Thread{
	public void run(){
		
			System.out.println("Thread 1 started ");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
			  e.printStackTrace();
			}
			System.out.println("Thread 1 is ended");
		}
	
}
class MyClass2 extends Thread{
	public void run(){
		
			System.out.println("Thread 2 started ");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
			  e.printStackTrace();
			}
			System.out.println("Thread 2 is ended");
		}
	
}// join  ex :  Im join with u; 
public class JoinEx {

	public static void main(String[] args) {
		MyClass1 m1 =new MyClass1();
		m1.start();
		
		
		MyClass2 m2 =new MyClass2();
		m2.start();
		try{
			m2.join();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		

	}

}
