package java.interview.question.by.naveen;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		//1. using algo
		/*
		 * int num=12345; //54321 int rev=0;
		 * 
		 * while(num!=0) { rev=rev*10+num%10; num=num/10; }
		 * System.out.println("Reverse number is "+rev);
		 */
		
		//2. using String buffer
		long num1=123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
