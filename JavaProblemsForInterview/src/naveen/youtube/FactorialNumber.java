package naveen.youtube;

public class FactorialNumber {

	
	//1. wihout recursive -- use the loop
	public static int factorial(int num) {
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	//2. with recussive
	public static int fact(int n) {
		if(n==0||n==1)
			return 1;
		else
			return (n*fact(n-1));
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fact(7));
	}

}
