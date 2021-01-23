package collections;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		String  s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		if(s==null || t==null)
			return false;
		
		if(s.length()!=t.length())
			return false;
		
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i)-'a');
//			System.out.println(t.charAt(i)-'a');
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
			
		}
		System.out.println(arr.length);
		
		for(int i:arr) {
			if(i!=0)
				return false;
		}
		
		return true;
	}

}
