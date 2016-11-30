package Slt;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		int A[]={10,20,30};
		int B[]=A;// Shallow Copy
		
		
		/*A[0]=10,A[1]=20,A[3]=30
		What is A??? Address of first Location i.e;&A[0]
		what is B??? &A[0]
		Both A & B Also pointing  same memory    
		
		In Array searching by index will take constant time -O(1)?
		// A=== &A[0]
		 //if u know the address of firsr location ==1000
		  if u know how many bytes it will take for each location =4 for int 
		  if u want know nth location 
		  Address = A*4
		  
*/		
		
		for (int i=0;i<A.length;i++){
			B[i]=A[i];
		}
		// Or You Can Use Clone 
		B=A.clone();//deep Copy - Prototype
		
		B[1]=200;
		System.out.println(A[1]);
	}
		
		
		
		
		
		
	}
