package Collections.SetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		hs.add("Alpha");
		hs.add("testing");
		hs.add("Beta");
		hs.add("Alpha");
		hs.add(null);
		System.out.println(hs);		
		
		System.out.println(hs.contains("testing"));
		
		for(String e:hs) {
			System.out.println(e);
		}
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hs.remove("Beta");
		System.out.println(hs);
		
		
		Set<Integer> first=new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,4,76,4,8,9,10}));
		
		Set<Integer> second=new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,7,0}));
		
		//get the union:
		Set<Integer> union=new HashSet<>(first);
		union.addAll(second);
		System.out.println(union);
		System.out.println("---------------------");
		
		Set<Integer> intersection=new HashSet<>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		System.out.println("----------------------");
		
		Set<Integer> diff=new HashSet<>(first);
		diff.removeAll(second);
		System.out.println(diff);
		System.out.println("----------------------");
		
	}

}
