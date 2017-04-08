package exception;

public class Parent {
	
	public Parent(){
		System.out.println("I am Parent");
		}
		}
		class Child extends Parent{
		public Child(int x){
		System.out.println("I am Child");
		}
		public static void main(String [] args){
		Child c=new Child(10);
		}


}
