package CollectionsConcept;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		set.add("Ravi");

		// Removing specific element from HashSet
		set.remove("Ravi");

		System.out.println("After invoking remove(object) method: " + set);

	}

}
