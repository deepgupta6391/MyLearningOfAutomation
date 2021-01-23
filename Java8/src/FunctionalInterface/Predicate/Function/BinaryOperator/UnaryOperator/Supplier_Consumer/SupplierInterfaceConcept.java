package FunctionalInterface.Predicate.Function.BinaryOperator.UnaryOperator.Supplier_Consumer;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {

		// takes no argument and returns result:

		getText(() -> "java");

	}

	public static void getText(Supplier<String> text) {
		System.out.println(text.get());
	}

}
