package LambdaConcept;


//SAM -- Single abstract method

@FunctionalInterface
public interface WebPage {

	//void header(String value);
	
	void header(String value,int age);
	
	public static void headerStatic() {
		System.out.println("this is static method of interface");
	}
	
	default void headerDeafult() {
		System.out.println("this is default method of interface");
	}
}
