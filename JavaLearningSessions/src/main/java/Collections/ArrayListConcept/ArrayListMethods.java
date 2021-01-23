package Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("dev ops");
		
		
		System.out.println("-------------------------");
		Collections.reverse(ar1);
		System.out.println(ar1);
		Collections.sort(ar1,Collections.reverseOrder());
		System.out.println(ar1);
		
		System.out.println("-------------------------");
		
//		ar1.addAll(ar2);
//		System.out.println(ar1);
		
//		ar1.addAll(2,ar2);
//		System.out.println(ar1);
		
//		ar1.clear();
//		System.out.println(ar1);
		
//		ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
//		System.out.println(cloneList);
		
 
		
		System.out.println(ar1.contains("python"));
		System.out.println(ar1.contains("lulala"));
		System.out.println(ar1.indexOf("ruby")>0);
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("Deeps","Tom","Deeps","Steve","Lisa","Deeps"));
		System.out.println(list1);
		System.out.println(list1.indexOf("Deeps"));
		int i=list1.lastIndexOf("Deeps");
		System.out.println(i);
		System.out.println(list1.indexOf("lulala"));//-1 as it is not available
		
		list1.remove(1);
		System.out.println(list1);
		list1.remove("Deeps");
		System.out.println(list1);
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.removeIf(num -> num%2==0);
//		System.out.println(numbers);
		numbers.removeIf(num -> num%2 != 0);
		System.out.println(numbers);
		
		ArrayList<String> namesList=new ArrayList<String>(Arrays.asList("Deeps","Tom","Naveen","Deeps","Lisa","Peter"));
		System.out.println(namesList);
		namesList.retainAll(Collections.singleton("Deeps"));
		System.out.println(namesList);
		
		ArrayList<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> subList=new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(subList);
		
		ArrayList<String> newList=new ArrayList<String>(Arrays.asList("Deeps","Tom","Naveen","Deeps","Lisa","Peter"));
		Object arr[]=newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o:arr) {
			System.out.println((String)o);
		}
		
	}

}
