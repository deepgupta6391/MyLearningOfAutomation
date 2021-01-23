package Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> studentList=new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Deeps");
		studentList.add("Jiten");
		
		//typical for loop
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		System.out.println("----------");
		
		//for each loop:
		for(String s:studentList) {
			System.out.println(s);
		}
		System.out.println("----------");
		
		//JDK8 - streams with lambda
		studentList.stream().forEach(ele -> System.out.println(ele));
		studentList.forEach(e->System.out.println(e.toLowerCase()));
		
		System.out.println("----------");
		
		//iterator:
		Iterator<String> it=studentList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("----------");
		
		//ListIterator:
		ListIterator<String> itList=studentList.listIterator();
		itList.next();
		itList.set("Meeeeeeeeeeee");
		System.out.println(itList.nextIndex());
		System.out.println(itList.nextIndex());
		System.out.println(itList.previousIndex());
		System.out.println(itList.previousIndex());
		itList.add("Lulala");
		
		for(String lst:studentList) {
			System.out.println(lst);
		}
	}

}
