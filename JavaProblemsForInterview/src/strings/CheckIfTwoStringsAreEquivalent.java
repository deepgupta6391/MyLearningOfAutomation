package strings;

public class CheckIfTwoStringsAreEquivalent {

	public static void main(String[] args) {
		String word1[]=new String[] {"ab","c"};
		String word2[]=new String[] {"a","bc"};
		
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
	
	 public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	     String s1="",s2=""; 
	      
		 for(String s:word1) {
			s1=s1.concat(s); 
		 }
		 
		 for(String s:word2) {
			s2=s2.concat(s); 
		 }
		 
		 return s1.equals(s2);
	 }
}
