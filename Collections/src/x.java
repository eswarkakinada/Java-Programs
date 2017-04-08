import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x {

	public static void main(String[] args) {
		/*String s="hi how are you what hi hell";

        String[] stringArray = s.split(" ");
        int arrayLength = stringArray.length;
        System.out.println("The number of Words is "+arrayLength);

        for (int i=0;i<arrayLength;i++){
        	
        	if(stringArray[i].equals("hi")){
        		
        		System.out.println(stringArray[i]);
        	}
        	
        }
	
     */
		String line = "hi hell huw are yhou duf ";

		for(String str :line.split(" ")){
			
			if(str.indexOf('a')==0)
			{
				System.out.println(str);
			}
		}}}
		
//		
//		
//		Pattern pattern = Pattern.compile("a\\w+");
//
//		Matcher matcher = pattern.matcher(line);{
//		while (matcher.find())
//		{
//		    System.out.println(matcher.group());
//		}
//		
//		
//		}}}
/*	    public static void main(String[] args) 
	    {
	        int n, temp;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] < a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.print("Descending Order:");
	        for (int i = 0; i > n - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	        System.out.print(a[n - 1]);
	    }
	}
*/