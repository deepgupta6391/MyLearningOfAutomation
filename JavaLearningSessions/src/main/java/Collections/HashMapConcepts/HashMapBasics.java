package Collections.HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//no order - no indexing
		//stores values -- key-value<k,v>
		//key cannot be duplicate
		//can store n number of null values but only 1 null key
		
		HashMap<String, String> capitalMap=new HashMap<String,String>();
		capitalMap.put("India","New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		System.out.println("The previos value of UK is "+capitalMap.put("UK","London11"));
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France",null);
		
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		System.out.println(capitalMap.get("France"));
		capitalMap.remove("France");
		
		//System.out.println(capitalMap);
		
		//1. iterator: over the keys
		Iterator<String> it=capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=capitalMap.get(key);
			System.out.println("Key = "+key+"---- Value = "+value);			
		}
		
		System.out.println("*****************************************");
		
		//2. iterator: over the set(pair): by using entrySet
		Iterator<Entry<String,String>> it1=capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String,String> entry=it1.next();
			System.out.println("Key = "+entry.getKey()+"---- Value = "+entry.getValue());	
		}
		
		System.out.println("*****************************************");
		
		//3. iterate using java 8 for each lambda
		capitalMap.forEach((k,v)->System.out.println("Key = "+k+"---- Value = "+v));
		
		
	
	}

}
