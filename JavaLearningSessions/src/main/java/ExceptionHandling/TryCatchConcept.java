package ExceptionHandling;

import java.util.Arrays;

public class TryCatchConcept {
	String name = "Tom";

	public static void main(String[] args) throws Exception {

		// TryCatchConcept obj = null;
		TryCatchConcept obj = new TryCatchConcept();

		System.out.println("A");
		System.out.println("B");

		// JVM will throw an exception with the help of:
		// 1. it will create the object of Exception class
		// 2. it will print the exception info with the help of stack trace and
		// exception handler

		try {
			// obj = null;
			System.out.println(obj.name);
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Some exception occurred ");
			e.printStackTrace();
			System.out.println(e.getMessage() + " exception got occurred...");
		} catch (NullPointerException e1) {
			System.out.println("Null pointer exception occurred");
			e1.printStackTrace();
		}

		System.out.println("C");
		System.out.println("C");
		System.out.println("C");
		System.out.println("C");

		try {
			int p=9/0;
		}catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
