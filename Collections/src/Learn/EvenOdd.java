package Learn;

public class EvenOdd {
	public static void e() {
		int i , num , c = 0, c2 = 0;
		for (i =1; i <= 100; i++) {

			if (i % 2 == 0) {

				c++;
			System.out.println("even"+i);	
			}
			else {
				c2++;
System.out.println("odd"+i);
			}

		}
		System.out.println("Even count " + c);
		System.out.println("Odd count " + c2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e();
	}

}
