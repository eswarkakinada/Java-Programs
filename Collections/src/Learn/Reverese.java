package Learn;

import java.util.Scanner;

public class Reverese {

	public static void rev() {

		int x, y, z = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int k = x;
		while (x > 0) {
			y = x % 10;
			z = z * 10 + y;
			x = x / 10;
		}
		System.out.println(z);
		if (k == z) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not A palindrome");
		}
	}

	public static void main(String[] args) {
		rev();
	}

}
