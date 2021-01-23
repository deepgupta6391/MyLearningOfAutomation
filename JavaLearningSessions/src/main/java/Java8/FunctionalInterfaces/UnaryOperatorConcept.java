package Java8.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {

	public static void main(String[] args) {

		/*
		 * Represents an operation on a single operand that produces a result of the
		 * same type as its operand. This is a specialization of Function for the case
		 * where the operand and result are of the same type.
		 */
		
		UnaryOperator<Integer> func=x->x*7;
		int n1=func.apply(10);
		System.out.println(n1);
		
		Function<Integer,Integer> func1= x->x*10;
		int n2=func1.apply(4);
		System.out.println(n2);
		
		List<String> langList=new ArrayList<String>();
		langList.add("Java");
		langList.add("Ruby");
		langList.add("Python");
		
		System.out.println(langList);
		
		langList.replaceAll(ele -> ele+" Deeps");
		
		System.out.println(langList);
	}

}
