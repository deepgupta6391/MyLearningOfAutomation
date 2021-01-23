package Collections.HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String,Integer> compMap=new HashMap<>();
		compMap.put("Google",10000);
		compMap.put("Walmart",20000);
		compMap.put("Amazon",30000);
		compMap.put("Facebook",5000);
		compMap.put("Cisco",1500);
		
		System.out.println("comp map size: "+compMap.size());
		
		Iterator<Entry<String,Integer>> it=compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,Integer> pairs=it.next();
			System.out.println(pairs.getKey()+"="+pairs.getValue());
		}

		compMap.forEach((k,v)->System.out.println("Key = "+k+" &&&& "+"Value = "+v));
		
		//convert hashmap keys into ArrayList:
		List<String> compNamesList=new ArrayList<String>(compMap.keySet());
		System.out.println("Total comp count: "+compNamesList.size());
		System.out.println(compNamesList);		
		for(String t:compNamesList) {
			System.out.println(t);
		}
		
		//convert hashmap values to Arraylist:
		List<Integer> EmpValuesList=new ArrayList<Integer>(compMap.values());
		System.out.println("Total comp count: "+EmpValuesList.size());
		System.out.println(EmpValuesList);		
		for(Integer t:EmpValuesList) {
			System.out.println(t);
		}
		
		
	}

}
