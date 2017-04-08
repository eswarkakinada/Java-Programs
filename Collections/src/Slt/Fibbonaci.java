package Slt;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {

		int a = 0, b = 1, c,i=1,n;
		
		System.out.println("Emnter how many fibbinaci serire you want ??");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		while(i<=n){
			System.out.print(a);
			c=a+b;
			a=b;
			b=c;
			
			i++;
			
		}
		
	}

}
