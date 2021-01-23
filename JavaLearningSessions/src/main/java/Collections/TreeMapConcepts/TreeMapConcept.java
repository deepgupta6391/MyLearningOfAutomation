package Collections.TreeMapConcepts;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robby");
		System.out.println(map);
		
		map.forEach((k,v)->System.out.println("key = "+k+"   value = "+v));
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		
		Set<Integer> keyLessThan3k=map.headMap(3000).keySet();
		System.out.println(keyLessThan3k);
		Set<Integer> keyGreaterThan3k=map.tailMap(3000).keySet();
		System.out.println(keyGreaterThan3k);
		
		TreeMap<String,Integer> userMap=new TreeMap<>(Collections.reverseOrder());
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);
		
		System.out.println(userMap);
		
		TreeMap<String,Integer> userMap1=new TreeMap<>(Comparator.reverseOrder());
		userMap1.put("James", 100);
		userMap1.put("Brad", 200);
		userMap1.put("Albert", 400);
		userMap1.put("George", 50);
		userMap1.put("Larry", 900);
		userMap1.put("Ted", 120);
		userMap1.put("Paul", 300);
		userMap1.put("This", null);
		System.out.println(userMap1);
		
		SortedMap<String, Integer> userMap2=Collections.synchronizedSortedMap(new TreeMap<>());
		userMap2.put("James", 100);
		userMap2.put("Brad", 200);
		userMap2.put("Albert", 400);
		userMap2.put("George", 50);
		userMap2.put("Larry", 900);
	}

}
