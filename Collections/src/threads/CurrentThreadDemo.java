package threads;

public class CurrentThreadDemo {
	
	public void showThread(){
		Thread th = new Thread();// this thread is cretaed explicitly
		th.setName("New Thread");
		System.out.println("Created Thread is :"+th.getName());
		//System.out.println("Current Thread is   : " +Thread.currentThread());
	}

	public static void main(String[] args) {
	
		CurrentThreadDemo c1=new CurrentThreadDemo();
		c1.showThread();

	}

}
//Current Thread is   : Thread[main,5,main]1. main =is name of thread and 5 is priority and 2.main is where the thread is called 