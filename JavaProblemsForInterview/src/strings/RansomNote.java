package strings;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {

		String ransomNote = "aab", magazine = "baa";
		System.out.println(canConstruct(ransomNote, magazine));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
		}
		System.out.println(map);

		for (int i = 0; i < ransomNote.length(); i++) {

			if (map.containsKey(ransomNote.charAt(i))) {
				if (map.get(ransomNote.charAt(i)) <= 0) {
					return false;
				}
			} else {
				return false;
			}

			map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
		}

		return true;

	}
}
