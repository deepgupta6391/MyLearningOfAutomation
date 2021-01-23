package Collections.HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;

	static {
		marksMap = new HashMap<String, Integer>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
		System.out.println("Executing static block");
	}

	public static void main(String[] args) {
		// 1.using HashMap class:
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();

		// 2.static way: static hashmap:
		System.out.println(HashMapInitialization.marksMap.get("A"));

		// 3.immutableMap with only one single entry:
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
		// map3.put("test1", 200);UnsupportedOperationException

		// 4.JDK 8:
		// creating one 2D array of Strings using stream and collecting in the fom of
		// map
		Map<String, String> map4 = Stream.of(new String[][] { { "Tom", "A Grade" }, { "Deep", "A++ Grade" } })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));

		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));

		// use SimpleEntry: mutable map:
		Map<String, String> map5 = Stream
				.of(new AbstractMap.SimpleEntry<>("Deeps", "Java"), new AbstractMap.SimpleEntry<>("Tom", "Python"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(map5.get("Deeps"));
		map5.put("Lisa", "C#");
		System.out.println(map5.get("Lisa"));

		// using simpleentry:immutablemap
		Map<String, String> map6 = Stream
				.of(new AbstractMap.SimpleImmutableEntry<>("Deeps", "Java"),
						new AbstractMap.SimpleImmutableEntry<>("Tom", "Python"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(map6.get("Deeps"));
		map6.put("Steve", "Ruby");
		System.out.println(map6.get("Steve"));
		map6.put("Deeps", "Ruby");
		System.out.println(map6.get("Deeps"));

		// JDK 1.9---refer word doc
		// empty map:
		// Map<String,String> emptyMap=Map.of();
		// emptyMap.put("Tom","Python");//UnsupportedOperationException

		// maps using Guava:
		Map<String, String> titleMaps = ImmutableMap.of("Google", "Google India", "Amazon", "Amazon Shopping");
		System.out.println(titleMaps.get("Amazon"));
		//titleMaps.put("Rediff", "Rediff India");//UnsupportedOperationException
		
		
		Maps.newHashMap();//modifiable
		Collections.unmodifiableMap(map1);//immutable
		ImmutableMap<String, String> map7=ImmutableMap.copyOf(map1);//Immutable
		//map7.put("One", "Two");//UnsupportedOperationException
		
		

	}

}
