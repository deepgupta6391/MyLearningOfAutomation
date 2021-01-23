package Collections.VectorConcepts;

import java.util.Vector;

public class Vector2DConcept {

	public static void main(String[] args) {
		
		Vector<String> langVector=new Vector<String>();
		langVector.add("Java");
		langVector.add("Python");
		langVector.add("Ruby");
		langVector.add("Javascript");
		langVector.add("C#");
		
		Vector<Vector<String>> osVector=new Vector<Vector<String>>();
		osVector.add(langVector);
		
		for(int i=0;i<langVector.size();i++) {
			String str=osVector.get(0).get(i);
			System.out.println(str);
		}
		
		

	}

}
