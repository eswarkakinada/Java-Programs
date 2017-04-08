package exception;

public class MyClass {
	static String str = "a";

	public static void main(String[] args) {
		new MyClass().method1();
		System.out.println(str);

	}

	void method1() {
		try {
			method2(); // 1

		} catch (Exception e) {
			str += "b";
		}
	}

	void method2() throws Exception {

		try {
			method3(); // 2 throws exception
			str += "c";
		} catch (Exception e) {
			throw new Exception();

		} finally {
			str += "d"; // here a & d Concatenated then it jups to method 1
						// exception and concatenated eith b and results ADB

		}
		method3();
	}

	void method3() throws Exception {// 3 here 2 &3 having same throw exception
		throw new Exception();
	}
}
