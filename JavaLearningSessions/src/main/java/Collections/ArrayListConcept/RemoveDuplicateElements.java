package Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 5, 1, 2, 3, 4, 5, 3, 3, 5, 7, 8, 9, 3, 2, 1, 4, 6, 7));
		
		//1.LinkedHashSet
		LinkedHashSet<Integer> likedHashSet=new LinkedHashSet<Integer>(numbers);
		System.out.println(likedHashSet);

		ArrayList<Integer> numberListWithoutDuplicate = new ArrayList<Integer>(likedHashSet);
		System.out.println(numberListWithoutDuplicate);
		
		//2.JDK 8 - stream:
		ArrayList<Integer> marksList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 5, 1, 2, 3, 4, 5, 3, 3, 5, 7, 8, 9, 3, 2, 1, 4, 6, 7));
		
		List<Integer> marksListUnique=marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
	}

}
