package java.interview.question.by.naveen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		findDuplicateWords("Hey BEST java is java best language is java");
		//findDuplicateWords("344 433 344");
	}

	public static void findDuplicateWords(String inputString) {
		
		//split
		String words[]=inputString.split(" ");
		
		//create hashmap
		Map<String,Integer> wordCount=new HashMap<String,Integer>();
		
		for(String word:words) {
			
			if(wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}
			else
			{
				wordCount.put(word.toLowerCase(),1);
			}
		}
				
		System.out.println("******************************");
		Set<String> keys=wordCount.keySet();
		System.out.println(keys);
		
		System.out.println("******************************");
		
		
		for(String word:keys) {
			if(wordCount.get(word)>1) {
				System.out.println(word+" count : "+wordCount.get(word));
			}
		}
	}
}
