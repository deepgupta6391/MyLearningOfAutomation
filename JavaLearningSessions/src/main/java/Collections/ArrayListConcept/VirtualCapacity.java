package Collections.ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {

		// default virtual capacity =10
		ArrayList<Object> ar = new ArrayList<>(20);// updated virtual capacity to 20
		System.out.println(ar.size());// Physical capacity=0

		ar.add(100);
		ar.add(200);

		System.out.println(ar.size());

		/*
		 * Increases the capacity of this ArrayList instance, if necessary, to ensure
		 * that it can hold at least the number of elements specified by the minimum
		 * capacity argument.
		 */ 
		ar.ensureCapacity(30);

	}

}
