package Learn;

public class StringReverese {

	public static void a() {
		String s = "madam";
		char[] A = s.toCharArray();
		int i, j = s.length() - 1;
		for (i = 0; i < j; i++, j--) {
			char B = A[i];
			A[i] = A[j];
			A[j] = B;
		}
		System.out.println(A);
		String B = new String(A);
		if (s.equals(B))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

	public static void main(String[] args) {
		a();
	}
}
