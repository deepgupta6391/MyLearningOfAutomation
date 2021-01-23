package Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("testing");//2
		ar.add('t');//3
		ar.add(12.33);//4
		ar.add(true);//5
		System.out.println(ar);
		System.out.println(ar.get(2));
		//System.out.println(ar.get(-1));// ==>ava.lang.ArrayIndexOutOfBoundsException: -1
		//System.out.println(ar.get(6));//java.lang.IndexOutOfBoundsException
		System.out.println(ar.size());
		System.out.println("LI = "+0);
		System.out.println("HI = "+(ar.size()-1));
		
		ar.add(400);//6
		ar.add(500);//7
		
		System.out.println(ar.size());
		
		//list with other collection
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Java","Python","JS","PHP"));
		System.out.println(names);
	}

}
