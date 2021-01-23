package FunctionalInterface.Predicate.Function.BinaryOperator.UnaryOperator.Supplier_Consumer;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {
	/**
	 * Represents an operation upon two operands of the same type, producing a
	 * result of the same type as the operands. This is a specialization of
	 * BiFunction for the case where the operands and the result are all of the same
	 * type.
	 * 
	 */

	public static void main(String[] args) {
		
		BinaryOperator<Integer> func=(x1,x2)->x1+x2;
		int t=func.apply(10, 20);
		System.out.println(t);

		//BiFunction interface:
		BiFunction<Integer, Integer, Integer> func1=(x1,x2)->x1+x2;
		int res=func1.apply(100, 10);
		System.out.println(res);
		
	}

}
