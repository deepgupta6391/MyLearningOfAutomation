package Java8.LambdaConcept;

//For example: Runnable , Comparable.
//SAM-----Single Abstract Method
@FunctionalInterface
public interface WebPage{

	void header(String val);
	
	//default	
	default void decorateWithDefault() {
		System.out.println("Default");
	}
	
	//static 
	static void decorateWithStatic() {
		System.out.println("Static");
	}
	
	@Override
	public int hashCode();
}
