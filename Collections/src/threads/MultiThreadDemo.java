package threads;

class cls1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				System.out.println("Thread 1  :"+i);
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class cls2 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				System.out.println("Thread 2  :" +i);
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadDemo {

	public static void main(String[] args) {
	
		 cls1 c1= new cls1();
		 c1.start();
		 try{
			 for(int i=0;i<5;i++){
			 System.out.println("Main Thread:"+i);
			 Thread.sleep(1000);
			 }
		 }catch(InterruptedException e){
			 e.printStackTrace();
		 }
		 
         cls2 c2 =new cls2();
         c2.start();
	}

}
