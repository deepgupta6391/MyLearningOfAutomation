package naveen.youtube;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class DuplicateElementsInAnArray {

	public static void main(String[] args) {
		
		String names[]= {"Java","JavaScript","C","Python","Java","Ruby"};
		
		//1.(n*n)
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is :: "+names[i]);
				}
			}
		}
		
		//2.using hashset
		Set<String> set=new HashSet<String>();
		for(String name:names) {
			if(set.add(name)== false) {
				System.out.println("Duplicate element is :: "+name);
			}
		}
		
		//3. using hashmap
		Map<String,Integer> map=new HashedMap<String,Integer>();
		for(String name:names) {
			Integer count=map.get(name);
			if(count==null) {
				map.put(name, 1);
			}else {
				map.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element is : "+entry.getKey());
			}
		}
		

	}

}
