package exception;

public class ReThrow {
	public static void m1(){
		try{
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception Caught here");
			throw e;// once again exception thrown back then it enters in catchblock of main 
			
		}
	}

	public static void main(String[] args) {
	
      try{
    	  m1();
    	  
      }catch(NullPointerException ex){
			System.out.println("m1() rethrow the exception.Handled here");
			
			
		}
	}

}
