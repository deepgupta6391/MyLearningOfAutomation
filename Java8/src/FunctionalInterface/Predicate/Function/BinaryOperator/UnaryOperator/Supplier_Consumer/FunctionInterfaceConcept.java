package FunctionalInterface.Predicate.Function.BinaryOperator.UnaryOperator.Supplier_Consumer;

import java.util.function.Function;

//having only 1 abstract method
public class FunctionInterfaceConcept {

	/**
	 * 
	 * Interface Function<T,R> Type Parameters: 
	 * T - the type of the input to the function 
	 * R - the type of the result of the function
	 */
	
	public static void main(String[] args) {
		
		Function<String, Integer> func=x -> x.length();
		int len=func.apply("This is java 8 i am learning");
		System.out.println(len);
		
		
		//chaining function:
		Function<Integer,Integer> func2=x->x*2;
		int result1=func.andThen(func2).apply("This is Deeps here");
		System.out.println(result1);
		
		
		
	}
}
