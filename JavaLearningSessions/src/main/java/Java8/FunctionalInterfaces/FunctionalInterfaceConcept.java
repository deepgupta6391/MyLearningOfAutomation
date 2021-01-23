package Java8.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		/*
		 * Interface Function<T,R> 
		 * Type Parameters: T - the type of the input to the
		 * function R - the type of the result of the function
		 */

		Function<String,Integer> func= x->x.length();
		int len=func.apply("This is java 8");
		System.out.println(len);
		
		
		new Function<String,Integer>() {

			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
		};
		
		
		//chaining function:
		Function<Integer, Integer> func1=x->x*2;
		int len1=func.andThen(func1).apply("This is Deeps here");
		System.out.println(len1);
	}

}
