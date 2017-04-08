package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		m();
		System.out.println("Code after Exception Handling");
		// TODO Auto-generated method stub

	}
static void m(){
	try {
		m();
		
	}
	catch(StackOverflowError e){
		e.getMessage();
		//e.toString();
	}
}
	
}
