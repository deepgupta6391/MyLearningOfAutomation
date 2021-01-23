package Collections.HashTable;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<>();
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robby");
		//map.put(null, null);---not allowed
		System.out.println(map);
		
	}

}
