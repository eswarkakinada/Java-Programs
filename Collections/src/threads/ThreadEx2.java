package threads;

public class ThreadEx2 implements Runnable { // threadEx2 is not child class of runnable becoz it does not extends it implements..

	public static void main(String[] args) {
	
		 ThreadEx2 ex=new ThreadEx2();
		// ex.run();
		 Thread th=new Thread(ex);// creating object to thread to thread constructor passing object of threadex2 as aparameter
		th.start();// if we comment th.start() then thread is in unstarted state
		// th.interrupt();// for killing thread
		 th.stop();
		 
		 System.out.println(th.isAlive());
		 th=new Thread(ex);// if this line not there then u got exception in thread main 
		 th.start();
	}

	@Override
	public void run() {
		
		for(int i=0;i<5;i++){
			try{
		System.out.println("Class is using Runnable Interface");
			Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
