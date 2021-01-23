package naveen.youtube;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n=789871;
		isPalindrome(n);
		isPalindrome(897798);

	}
	
	public static void isPalindrome(int n) {
		int rev=0;
		int num=n;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(rev==n) {
			System.out.println(n+" is palindrome");
		}else {
			System.out.println(n+" is not a palindrome");
		}
		
	}

}
