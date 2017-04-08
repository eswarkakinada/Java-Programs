package Slt;

import java.util.Scanner;

public class armstrong {
	public static void a(){
		 int c=0,a,n,temp;  System.out.println("enter a number");
		 Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
		    //It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
a();
	}

}
