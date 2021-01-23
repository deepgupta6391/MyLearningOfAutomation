package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		/*
		 * ArrayList ar = new ArrayList<>(); System.out.println(ar.size()); ar.add(100);
		 * ar.add(200); ar.add(300); ar.add(400); ar.add(500); System.out.println(ar);
		 * 
		 * ar.remove(1); // ar.get(4); System.out.println(ar.get(1));
		 * System.out.println(ar);
		 */

		ArrayList<String> names = new ArrayList<>(20);
		names.add("Deeps");
		names.add("Lovely");
		names.add("Jiten");
		names.add("Honey");

		// lambda expression:
		names.forEach((name) -> System.out.println(name));

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}

	}

}
