package strings;

public class LongestUncommonSubSeq01 {

	public static void main(String[] args) {
		String a="abc";
		String b="cde";
		System.out.println(findLUSlength(a,b));

	}
	 public static int findLUSlength(String a, String b) {
	        
	        if(a.equals(b)==true)
	            return -1;
	        
	        return Math.max(a.length(),b.length());
	    }

}
