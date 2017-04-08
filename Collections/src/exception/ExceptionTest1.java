package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		System.out.println("hi");
		try{
			
			System.out.println("In try block");
			System.exit(0);// it allows jvm to exit the program
		}finally{
			
			System.out.println("finally block executed");
		}

	}

}
