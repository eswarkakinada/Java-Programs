import java.util.Scanner;

public class StringPalindrome {
	
	static String orig,reverse="";
	static Scanner sc=new Scanner(System.in);
		
	public static void stringReverse(){
		
		System.out.println("Enter a string");
		orig=sc.nextLine();
		/*System.out.println(orig.toCharArray());*/
		char ch[]=orig.toCharArray();
		int i,j;
		char temp;
		for(i=0;i<orig.length();i++){
			/*System.out.print(ch[i]);
			System.out.println();
		*/}
		j=i-1;
		i=0;
		//char next[]=ch[];
		while(i<j)
	       {
	           temp = ch[i];
	           ch[i] = ch[j];
	           ch[j] = temp;
	           i++;
	           j--;
	       }
		System.out.print("Now the Reverse of Array is : \n");
	       for(i=0; i<orig.length(); i++)
	       {
	           System.out.print(ch[i]);
	       }
	       reverse=ch.toString();
	System.out.print(ch);
	if(ch[i]==ch[j]){
		System.out.println("given string is palindrome");
	}

}
	
	public static void main(String[] args) {
		stringReverse();
	}
	
}