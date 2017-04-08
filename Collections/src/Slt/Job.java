package Slt;

public class Job {

	static {
		// first preference for Static block
		System.out.println("Static bLock");
	}

	// Static method need to call explicitly
	public static void staticMethod() {
		System.out.println("StaticMethod");
	}

	// when u call new job() ony call to constructor
	public Job() {
		System.out.println("Constructor");
	}

	public Job(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		int k = 5;
		staticMethod();
		Job j1 = new Job();
		Job j = new Job(k);
	}
}
