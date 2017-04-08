package Learn;

import Learn.Outer.inner;
// In iinner class static methods cant be declared 
// doesnt means accessing The static members of outer class is not possilbe;
public class Outer1 {
	int x=10;
	static int y=5;
	 class inner{
		 public void m1(){
			 System.out.println(x);
			 System.out.println(y);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Outer1 o= new Outer1();
			inner i= o.new inner();
			 i.m1();
	}

}
