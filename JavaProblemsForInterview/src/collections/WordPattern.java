package collections;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba", s = "dog cat cat dog";
		System.out.println(wordPattern(pattern, s));
	}

	public static boolean wordPattern(String pattern, String s) {

		String[] arr = s.split(" ");
		
		if(arr.length != pattern.length())
	        return false;
		
		HashMap<Character, String> map = new HashMap<Character, String>();

		for (int i = 0; i < pattern.length(); i++) {

			char c = pattern.charAt(i);

			if (map.containsKey(c)) {

				String value = map.get(c);
				if (!value.equals(arr[i])) {
					return false;
				}

			} else if (map.containsValue(arr[i])) {
				return false;
			}
			map.put(c, arr[i]);
		}

		System.out.println(map);

		return true;
	}

}
