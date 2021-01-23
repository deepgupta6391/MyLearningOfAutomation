package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindFirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		System.out
				.println("First non repeated character for String analogy is : " + getNonRepeatedCharacter("analogy"));
		System.out
				.println("First non repeated character for String easiest is : " + getNonRepeatedCharacter("easiest"));
	}

	public static Character getNonRepeatedCharacter(String s) {

		Map<Character, Integer> countChar = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			countChar.put(c, countChar.getOrDefault(c, 0) + 1);
		}

		Set<Entry<Character, Integer>> set = countChar.entrySet();

		for (Entry<Character, Integer> e : set) {
			if (e.getValue() == 1)
				return e.getKey();
		}

		return null;

	}
}
