package Learn;

public class First {

	public static void main(String[] args) {

		int A[] = { 14, 46, 47, 86, 92 };
		int largest = A[0];
		
		
		
		for (int i = 0; i < A.length; i++) {
 
			if (A[i] > largest) {
				
				largest = A[i];
 
			}
			
		}
 
		System.out.println("\n largest number is:" + largest);
 
	}
		

	}

