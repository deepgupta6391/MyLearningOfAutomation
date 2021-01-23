package strings;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		
		String s="abbcccddddeeeeedcba";
		System.out.println(maxPower(s));
	}
	
	public static int maxPower(String s) {
		int max=1;
		
		for(int i=1;i<s.length();i++) {
			int count=1;
			
			while(i<s.length() &&(s.charAt(i-1)==s.charAt(i))) {
				count++;
                i++;
				max=Math.max(count, max);
			}
		}
		

		return max;
	}

}
