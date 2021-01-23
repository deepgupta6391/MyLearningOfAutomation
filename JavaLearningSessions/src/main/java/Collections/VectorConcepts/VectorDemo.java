package Collections.VectorConcepts;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> myVec = new Vector<Integer>();
		myVec.add(2);
		myVec.add(4);
		myVec.add(6);
		myVec.add(8);
		myVec.add(10);
		myVec.add(12);
		myVec.add(14);
		myVec.add(16);

		System.out.println(myVec);
		System.out.println(myVec.get(2));
		myVec.remove(2);
		System.out.println(myVec);

		Vector<Integer> yourVec = new Vector<Integer>();
		yourVec.add(10);
		yourVec.add(11);

		myVec.addAll(yourVec);
		System.out.println(myVec);
		
		myVec.setSize(30);

		for (Integer i : myVec) {
			System.out.println(i);
		}

		System.out.println("******************");

		for (int p = 0; p < myVec.size(); p++) {
			System.out.println(myVec.get(p));
		}

		System.out.println("******************");

		Iterator<Integer> it = myVec.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("******************");
		
		Enumeration<Integer> en=myVec.elements();
		 while(en.hasMoreElements()) {
		       System.out.println(en.nextElement());
		  }
		
		Collections.sort(myVec);
		System.out.println(myVec);
		
		System.out.println(myVec.size());
		myVec.setSize(20);
		System.out.println(myVec.size());
		
	}

}
