package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
	System.out.println("Method return   :"+m());

	}
	static String m(){
		try {
			
		}catch(ArithmeticException e){
			return "catch";
		}
		finally{
			return "finally";
		}
	}

}
