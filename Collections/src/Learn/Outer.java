package Learn;

 public class Outer {
	
	class inner{
	
		
		public void m(){
			System.out.println("Inner class");
		
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Inside the Outer Class");

		 Outer o= new Outer();
		Outer.inner i= o.new inner();
		 i.m();
	}

}
