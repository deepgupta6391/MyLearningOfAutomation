package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInAnArray {

	public static void main(String[] args) {
		String words[]=new String[] {"mass","as","hero","superhero"};
		
		System.out.println(Arrays.toString(stringMatching(words).toArray()));

	}
	
	public static List<String> stringMatching(String[] words) {
        Set<String> res=new HashSet<String>();
        
        for(int i=0;i<words.length;i++) {
        	for(int j=0;j<words.length;j++) {
        		if(words[i].contains(words[j]) && words[i]!=words[j])
        			res.add(words[j]);
        	}
        }
        
        return new ArrayList<>(res);
    }

}
