package StringConcept;

public class ReverseString {

	public static void main(String[] args) {
		//System.out.println(reverseString(null));
		System.out.println(reverseString("Selenium"));
	}

	public static String reverseString(String value) {
		
		if(value==null) {
			System.out.println("you are passing a null value....");
			return null;
		}
		
		int len=value.length();
		
		if(len==1)
			return value;
		
		String rev="";
		
		for(int i=value.length()-1;i>=0;i--) {
			rev=rev+value.charAt(i);
		}
		
		return rev;
	}
}
