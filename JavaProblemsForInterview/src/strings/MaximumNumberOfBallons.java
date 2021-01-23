package strings;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallons {

	public static void main(String[] args) {
		
		String text="lloo";
		System.out.println(maxNumberOfBalloons(text));

	}

	public static int maxNumberOfBalloons(String text) {

		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(Character c:text.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int maxCount=Integer.MAX_VALUE;
		maxCount=map.getOrDefault('l', 0)/2;
		maxCount=Math.min(map.getOrDefault('o', 0)/2, maxCount);
		maxCount=Math.min(map.getOrDefault('b', 0), maxCount);
		maxCount=Math.min(map.getOrDefault('a', 0), maxCount);
		maxCount=Math.min(map.getOrDefault('n', 0), maxCount);
		
		return maxCount;
		
	}
}
