package Slt;

public class ThrowsDemo {  
	  static void throwMethod() throws Exception {  
	    System.out.println("Inside throwMethod.");  
	    throw new IllegalAccessException("demo");  
	  }  
	  public static void main(String args[]) throws Exception {  
	    try {  
	      throwMethod();  
	    } catch (IllegalAccessException e) {  
	      System.out.println("Caught " + e);  
	    }  
	  }  
	}  

