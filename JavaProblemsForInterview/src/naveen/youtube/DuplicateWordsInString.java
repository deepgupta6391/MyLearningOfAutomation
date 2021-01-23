package naveen.youtube;

import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		findDuplicateWords("Hey java is java best language is java");

	}

	public static void findDuplicateWords(String inputString) {

		String words[] = inputString.split(" ");
		Map<String, Integer> wordCount = new HashedMap<String, Integer>();

		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		System.out.println(wordCount);
		
		Set<String> wordsInString=wordCount.keySet();
		for(String word:wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word+" : "+wordCount.get(word));
			}
		}
	}
	
	

}
