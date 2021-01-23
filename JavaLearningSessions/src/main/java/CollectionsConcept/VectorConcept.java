package CollectionsConcept;

import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		Vector vec = new Vector();
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add(200);

		// add using addElement()
		vec.addElement("Cat");
		System.out.println("Elements are : " + vec);

		// check size and capacity:
		System.out.println("Size is: " + vec.size());
		System.out.println("Default capacity is: " + vec.capacity());

		// check contains method
		// Checking if Tiger is present or not in this vector
		if (vec.contains("Tiger")) {
			System.out.println("Tiger is present at the index " + vec.indexOf("Tiger"));
		} else {
			System.out.println("Tiger is not present in the list.");
		}
		
		//get first element
		System.out.println("First ele is : "+vec.firstElement());
		
		//get last element
		System.out.println("Last ele is : "+vec.lastElement());
		
		//removing by element
		vec.remove((Integer)200);
		
		//removing by index
		//vec.remove(1);
		vec.removeElementAt(1);
		
		System.out.println(vec);
		
		System.out.println(vec.get(1));
	}

}
