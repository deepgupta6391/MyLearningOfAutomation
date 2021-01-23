package strings;

public class ReverseOnlyLetters {

	public static void main(String[] args) {

		//String s = "a-bC-dEf-ghIj";
		String s="7_28]";
		System.out.println(reverseOnlyLetters(s));
	}

	public static String reverseOnlyLetters(String s) {

		char[] ch=s.toCharArray();
		int left=0;
		int right=ch.length-1;
		
		while(left<right) {
			if(Character.isLetter(ch[left]) && Character.isLetter(ch[right])) {
				char temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				left++;
				right--;
			}
			else if(Character.isLetter(ch[left]) && !Character.isLetter(ch[right])) {
				right--;
			}
			else if(!Character.isLetter(ch[left]) && Character.isLetter(ch[right])) {
				left++;
			}
			else {
				right--;
				left++;
			}
		}
		
		return String.valueOf(ch);
	}
}
