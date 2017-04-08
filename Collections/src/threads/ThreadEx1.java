 package threads;

public class ThreadEx1 extends Thread {// threadex1 is child class of thread then thread ex1 is also called as thread

	 public void run(){
		 System.out.println("Thread is running");
	 }
	public static void main(String[] args) {
	 
		 ThreadEx1 ex=new ThreadEx1();
		 ex.start();
		 System.out.println("Thread is Started");  // main method will given first preference
		 System.out.println("Thread is Ended");

	}

}
