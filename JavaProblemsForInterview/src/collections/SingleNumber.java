package collections;

import java.util.HashMap;
import java.util.Hashtable;

public class SingleNumber {

	public static void main(String[] args) {

		int[] nums=new int[] {4,1,2,1,2};
		
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		
		Hashtable<Integer,Integer> map=new Hashtable<Integer,Integer>();
		for(int i:nums) {
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		
		for(int i:nums) {
			if(map.get(i)==1)
				return i;
		}
		return -1;		
	}

}
