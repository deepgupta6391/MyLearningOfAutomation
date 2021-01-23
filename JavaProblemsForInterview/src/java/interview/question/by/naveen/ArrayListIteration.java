package java.interview.question.by.naveen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Taral mehta olta chashma");
		al.add("Game of Thrones");
		al.add("Prison Break");
		al.add("The Walking Dead");
		al.add("Republic Tv");
		
		//1. using java 8 with for each loop and lambda expression:
		al.forEach(shows -> {
			System.out.println(shows);
		});
		
		System.out.println("1. ----------------------");
		
		//2. using Iterator:
		Iterator<String> iter=al.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("2. ----------------------");
		
		//3. using iterator and java 8 forEachRemaining() method
		
		iter=al.iterator();
		iter.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		System.out.println("3. ----------------------");
		
		//4. using for each loop
		for(String show:al) {
			System.out.println(show);
		}
		
		System.out.println("4. ----------------------");
		
		//5. using for loop with order/index:
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("5. ----------------------");
		
		//6. using a listIterator() to traverse in both the directions
		ListIterator<String> alListIterator=al.listIterator(al.size());
		while(alListIterator.hasPrevious()) {
			String show=alListIterator.previous();
			System.out.println(show);
		}
		System.out.println("*************************");
		
		while(alListIterator.hasNext()) {
			String show=alListIterator.next();
			System.out.println(show);
		}
		
	}

}
