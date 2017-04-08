package exception;

public class test {
	
	static void play()  
    {
        try
        {	
            System.out.println("before");
            throw new IllegalAccessException("demo");
            //System.out.println("after");
        }
        catch(Exception e)
        {	
            System.out.println("Exception e"+e);
        }
    }

    public static void main(String args[]) throws Exception
    {
        play();
    }	

}
