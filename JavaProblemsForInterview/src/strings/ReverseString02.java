package strings;

public class ReverseString02 {

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 3;
		System.out.println(reverseStr(s, k));
	}

	public static String reverseStr(String s, int k) {

		char[] c=s.toCharArray();
		
		for(int i=0;i<s.length();i+=2*k) {
			int start=i,end=Math.min(i+k-1, c.length-1);
			while(start<end) {
				char temp=c[start];
				c[start++]=c[end];
				c[end--]=temp;
			}
		}
		
		return String.valueOf(c);
	}

}
