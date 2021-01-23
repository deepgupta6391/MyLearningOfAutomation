package CollectionsConcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapAndHashTableConcept {
	
	//doesnot maintain the order

	public static void main(String[] args) {
		//HashMap< String, String> userMap=new HashMap<String,String>();
		
		Map<String, String> userMap1=new HashMap<String,String>();
		Map<String,String> userMap2=new Hashtable<>();
		
		userMap1.put("id","1");
		userMap1.put("name","Tom");
		userMap1.put("city","Bangalore");
		userMap1.put(null,"pune");
		userMap1.put(null, "Hyd");
		userMap1.put("company",null);
		userMap1.put("country",null);
		userMap1.put("city", "Ranchi");
		userMap1.getOrDefault("css", "defaultValue");

		
//		System.out.println(userMap1.get("id"));
//		System.out.println(userMap1.get("1"));
//		
//		System.out.println(userMap1.size());
//		
//		for(Map.Entry<String,String> m:userMap1.entrySet()) {
//			System.out.println(m.getKey()+"  "+m.getValue());
//		}
		
		System.out.println(userMap1);
		
		
		//hashtable:
		Hashtable<String,Integer> productTable=new Hashtable<String, Integer>();
		productTable.put("Apple MacBook",2000);
		productTable.put("Windows HP Laptop",1000);
		productTable.put("Apple iPhoneX", 1500);
		productTable.put("Apple iPhoneX", 1200);
		productTable.put("iPhoneX", 1200);
		//productTable.put(null, null);--------->java.lang.NullPointerException
		
		System.out.println(productTable);
		productTable.getOrDefault("asdasd", 00000);

//		for(Map.Entry<String,Integer> m:productTable.entrySet()) {
//			System.out.print(m.getKey()+"  "+m.getValue());
//		}
		
		//Diff
		//1.hashmap is not synchronized --- not thread safe            1.hashtable is syncronized
		//2.only 1 null key and multiple null values are allowed		2. no null key or value
		
	}

}
