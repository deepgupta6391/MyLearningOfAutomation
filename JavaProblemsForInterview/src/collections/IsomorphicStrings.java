package collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// String s = "egg", t = "add";
		// String s = "foo", t = "bar";
		// String s = "paper", t = "title";
		String s = "ab", t = "aa";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {

		Hashtable<Character, Character> table = new Hashtable<Character, Character>();
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {

			char x = s.charAt(i), y = t.charAt(i);

			if (table.containsKey(x)) {
				if (table.get(x) != y) {
					return false;
				}
			} else {
				if (set.contains(y)) {
					return false;
				}
				table.put(x, y);
				set.add(y);
			}
		}

		return true;
	}

}
