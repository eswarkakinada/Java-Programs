package Slt;

import java.util.Scanner;

public class Evn {
	public static void e(){
		int i,j ;
		System.out.println("enter a number");
		Scanner sc =  new Scanner(System.in);
		i=sc.nextInt();
		j=i/2;
		System.out.println(j);
		if(j*2==i){
			System.out.println("even"+j);
		}else {
			System.out.println("odd");
		}
		 
	}

	public static void main(String[] args) {
		e();

	}

}
