package java.interview.question.by.naveen;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//test1();
		//test2();
		division();

	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}catch (Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("finally inside test2");
		}
	}
	
	public static void division(){
		int i=10;
		try {
			System.out.println("Inside try block of division method");
			int k=i/0;
		}
		/*
		 * catch (ArithmeticException e) {
		 * System.out.println("Exception is :"+e.getLocalizedMessage());
		 * System.out.println("Divide by zero error"); }
		 */
		catch (NullPointerException e) {
			System.out.println("Inside null pointer exception");
		}
		finally {
			System.out.println("Execution this code even after exception");
		}
	}

}
