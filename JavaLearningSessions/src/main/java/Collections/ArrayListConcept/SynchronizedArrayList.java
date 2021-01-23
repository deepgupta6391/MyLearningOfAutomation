package Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		//1.Colletions.synchronizedList
		List<String> namesList=Collections.synchronizedList(new ArrayList<>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		//add,remove - we dont need explicit synchronization 
		//to fetch/traverse the valuesfrom this list -- we have to use explicit synchronization
		
		
		synchronized (namesList) {
			Iterator<String> it=namesList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		 
		//2.copyOnWriteArrayList -- its a class:Thread-safe/synchronized already:
		CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Jiten");
		empList.add("Deeps");
		
		//we don't need explicit synchronization on any operation: add/remove/traverse
		Iterator<String> it=empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
