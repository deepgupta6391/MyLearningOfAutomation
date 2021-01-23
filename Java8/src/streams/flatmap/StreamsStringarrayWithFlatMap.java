package streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsStringarrayWithFlatMap {

	public static void main(String[] args) {
		String data[][] = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

//		Stream<String[]> dataStream=Arrays.stream(data);	
//		
//		Stream<String> streamFlatMap=dataStream.flatMap(x -> Arrays.stream(x));		
//		//streamFlatMap.forEach(System.out::println);
//		Stream<String> streamFilter=streamFlatMap.filter(x -> "a".equals(x.toString()));
//		streamFilter.forEach(System.out::println);
//		
//		//composite actions
//		Stream<String> finalStream=Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "d".equals(x.toString()));
//		finalStream.forEach(System.out::println);

		List<List<String>> listofListOfCities = Arrays.asList(Arrays.asList("Delhi", "Mumbai"),
				Arrays.asList("Beijing", "Shanghai", "Tianjin"), Arrays.asList("Kathmandu", "Lalitpur"),
				Arrays.asList("Thimphu", "Phuntsholing"));

//		listofListOfCities.stream().flatMap(x -> x.stream()).filter(s -> s.startsWith("A")).collect(Collectors.toList())
//				.forEach(System.out::println);
//
//		listofListOfCities.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		Stream<String> lst=listofListOfCities.stream().
				flatMap(x -> x.stream()).distinct().map(String::toUpperCase);
		lst.forEach(System.out::println);
	}

}
