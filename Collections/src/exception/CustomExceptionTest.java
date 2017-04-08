package exception;

import java.util.Scanner;

public class CustomExceptionTest {

	public void checkAge() throws Exception {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age ");
		age = sc.nextInt();
		if (age >= 18 && age <= 25)

			System.out.println("Eligible " + age);
		else
			throw new Exception("invalid age ");

	}

	public static void main(String[] args) {

		CustomExceptionTest c1 = new CustomExceptionTest();

		try {
			c1.checkAge();
		} catch (Exception e) {
			System.out.println("Exception Caught :  " + e);
		}

	}

}
