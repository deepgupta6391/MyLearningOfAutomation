package strings;

import java.util.Arrays;

public class NumberOfSegmentsInAString {

	public static void main(String[] args) {

		String s1 = "Hello, my name is John";
		String s2 = "love live! mu'sic forever";
		String s3="";
		String s4=", , , ,        a, eaefa";
		//System.out.println(s3.length());
		System.out.println(countSegments(s2));
	}

	public static int countSegments(String s) {

		int count=0;
		//1.
//		String[] arr = s.split(" ");
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].length()>0)
//				count++;
//		}
		
		//2.
		for(int i=0;i<s.length();i++) {
			if((i==0 || s.charAt(i-1)==' ') && s.charAt(i)!=' ')
				count++;
		}
		
		return count;
	}
}
