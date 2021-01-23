package OOP_AbstractConcept;

public abstract class Page {

	// abstract class constructor can be called, but it will be called with child
	// class object creation
	public Page() {
		System.out.println("Page class Const....");
	}
	
	public Page(String word) {

		System.out.println("Page class Const with parameter....");
	}
	

	// abstract methods and non abstract methods

	public abstract void header();

	protected abstract void title();
	
	abstract void title2();

	public final void logout() {
		System.out.println("user logged out");
	}
	
	public static void signUp() {
		System.out.println("Page -- Sign Up");
	}

	protected void test1() {

	}

	private void test3() {
		System.out.println("Private methods are allowed");
	}
	
	//warning
//	private static void signUp1() {
//		System.out.println("Page -- Sign Up");
//	}
	
	
}
