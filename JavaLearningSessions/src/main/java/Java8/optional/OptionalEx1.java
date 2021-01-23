package Java8.optional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {

		Optional<Character> opCh=getNonRepeatedCharacterOpt("SASAS");
		
        if(opCh.isPresent())
            System.out.println("Non repeated character is :"+opCh.toString());
        else
        {
            System.out.println("No non repeated character found in String");
        }
 
        
	}

	public static Optional<Character> getNonRepeatedCharacterOpt(String str) {
		Map<Character,Integer> countChar=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			countChar.put(c, countChar.getOrDefault(c, 0)+1);
		}
		System.out.println(countChar);
		for(Entry<Character,Integer> e:countChar.entrySet()) {
			if(e.getValue()==1) {
				return Optional.of(e.getKey());
			}
		}
		
		return Optional.ofNullable(null);
	}
}
