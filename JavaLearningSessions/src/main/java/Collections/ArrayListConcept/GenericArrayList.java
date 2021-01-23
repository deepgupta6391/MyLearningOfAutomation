package Collections.ArrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		int a=200;
		
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(a);
		
		System.out.println(marksList);
		
		ArrayList<Double> arD=new ArrayList<Double>();
		arD.add(12.33);
		arD.add((double) 100);
		System.out.println(arD);
		

		ArrayList<String> studentsName=new ArrayList<String>();
		studentsName.add("Tom");	
	}

}
