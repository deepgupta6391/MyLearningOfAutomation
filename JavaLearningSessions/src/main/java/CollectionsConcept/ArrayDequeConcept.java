package CollectionsConcept;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeConcept {

	public static void main(String[] args) {
		Deque<String> dequeArr = new ArrayDeque<String>();
		dequeArr.add("Ravi");
		dequeArr.add("Vijay");
		dequeArr.add("Ajay");
		//dequeArr.add(null);//not allowed
		
		
		
		Deque<String> lst = new LinkedList<String>();
		lst.add("Ravi");
		lst.add("Vijay");
		lst.add("Ajay");
		lst.pollLast();
		lst.add(null);
		System.out.println(lst);
	}

}
