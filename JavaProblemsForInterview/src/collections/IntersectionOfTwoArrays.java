package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int[] nums1=new int[] {1,2,2,1};
		int[] nums2=new int[] {2,2};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set=new HashSet<>();
		for(int i:nums1) {
			set.add(i);
		}
		
		HashSet<Integer> intersection=new HashSet<>();
		for(int i:nums2) {
			if(set.contains(i)) {
				intersection.add(i);
			}
		}
		
		int[] res=new int[intersection.size()];
		int index=0;
		for(int i:intersection) {
			res[index++]=i;
		}
		
		return res;
    }

}
