package java.interview.question.by.naveen;

public class StringSwap {

	public static void main(String[] args) {
		
		//swap without using temp string
		
		String a="HelloRamp";
		String b="World";
		
		System.out.println("before swapping: ");
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		
		//1. append a and b
		a=a+b;
		
		//2. store initial string a in string b
		b=a.substring(0,a.length()-b.length());
		
		//store initial string b in string a
		a=a.substring(b.length());
		
		System.out.println("after swapping: ");
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	}

}
