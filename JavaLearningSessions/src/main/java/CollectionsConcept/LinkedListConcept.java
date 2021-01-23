package CollectionsConcept;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListConcept {
	
	/*
	 * When to use ArrayList or LinkedList?
	 * If we have more insertion or deletion then we should use LinkedList. 
	 * If we have less insertion or deletion and more search operations then we should use ArrayList.
	 */
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");		
		System.out.println("content of linkedlist : "+ll);
		
		//addFirst:
		ll.addFirst("Deeps");		
		//addLast:
		ll.addLast("Automation");
		System.out.println("content of linkedlist : "+ll);
		
		//get:
		System.out.println(ll.get(0));
		//set:
		ll.set(0,"Tom");
		System.out.println(ll.get(0));
		System.out.println("content of linkedlist : "+ll);
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist : "+ll);
		
		ll.remove();// removes head by default
		ll.remove(2);
		System.out.println("content of linkedlist : "+ll);
		
		//how to print values of LinkedList:
		//for loop
		System.out.println("***********using for loop");
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		System.out.println("*********using advance for loop");		
		//advance for loop
		for(String s:ll) {
			System.out.println(s);
		}
		
		System.out.println("***************using lambda");
		ll.forEach(s->System.out.println(s));
		
		System.out.println("*****************using iterator");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*****************using while only");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		ListIterator<String> itr1=ll.listIterator(ll.size());
		System.out.println("previous---------------------");
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
	}

}
