package CollectionsConcept;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueConcept {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println(queue);
//		queue.offer("Deeps");		
//		System.out.println(queue);
//		queue.remove();
//		System.out.println(queue);
//		queue.peek();
//		System.out.println(queue.peek());
		//queue.add(null);//not allowed
		queue.poll();
		queue.poll();
		
		System.out.println(queue);
		
		
		Queue<String> lst = new LinkedList<String>();
		lst.add("Ravi");
		lst.add("Vijay");
		lst.add("Ajay");
		System.out.println(lst);
		lst.poll();
		System.out.println(lst);
		
	}

}
