package threads;

class Table1{
	synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
}
class MyThread1 extends Thread{
	Table1 t;
	MyThread1(Table1 t){
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(5);
	}	
}
class MyThread2 extends Thread{
	Table1 t;
	MyThread2(Table1 t){
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(6);
	}	
}




public class TestSynchronization {

	public static void main(String[] args) {
		
		
		Table1 obj =new Table1();
		MyThread1 t1 =new MyThread1(obj);
		MyThread2 t2 =new MyThread2(obj);
		t1.start();
		t2.start();
		   

	}

}
