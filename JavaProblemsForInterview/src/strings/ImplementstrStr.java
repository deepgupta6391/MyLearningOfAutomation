package strings;

public class ImplementstrStr {

	public static void main(String[] args) {
		// String haystack = "hello", needle = "lo";
		String haystack = "aaaaa", needle = "bba";
		 
		 //System.out.println(haystack.contains(needle));
		 if(needle.isEmpty()) {
			 System.out.println();
		 }
		 else if(haystack.contains(needle)) {
			 System.out.println(haystack.indexOf(needle));
		 }else {
			 System.out.println(-1);
		 }
		 

	}

}
