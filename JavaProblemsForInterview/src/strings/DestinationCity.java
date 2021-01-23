package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class DestinationCity {

	public static void main(String[] args) {
		
		List<String> val1=Arrays.asList("London","New York");
		List<String> val2=Arrays.asList("New York","Lima");
		List<String> val3=Arrays.asList("Lima","Sao Paulo");
		
		List<List<String>> paths= new ArrayList<List<String>>();
		paths.add(val1);
		paths.add(val2);
		paths.add(val3);
		
		System.out.println(destCity(paths));
	}
	
	 public static String destCity(List<List<String>> paths) {
		 
		 HashMap<String,String> map=new HashMap<>();
		 for(List<String> lst:paths) {
			 map.put(lst.get(0), lst.get(1));
		 }
		 
		 Set<String> keys=map.keySet();
		 for(String city:keys) {
			 if(!map.containsKey(map.get(city))) {
				 return map.get(city);
			 }
		 }
		 
	     return "";   
	    }

}
