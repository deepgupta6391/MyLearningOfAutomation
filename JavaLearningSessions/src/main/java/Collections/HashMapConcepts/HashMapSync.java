package Collections.HashMapConcepts;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections4.map.HashedMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		//synchronized map in collection classs:
		Map<String,String> map1=new HashedMap<String,String>();
		map1.put("1", "Deeps");
		map1.put("2","Tom");
		map1.put("3","Lisa");
		
		
		//create synchronizedMap:
		Map<String,String> syncMap=Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		//concurrenthashMap:it does not throw any ConcurrentModificationException
		ConcurrentHashMap<String,String> concurrentMap=new ConcurrentHashMap<>();
		concurrentMap.put("A","Java");
		concurrentMap.put("B","Python");
		concurrentMap.put("c","Ruby");
		
		System.out.println(concurrentMap.get("A"));
		

	}

}
