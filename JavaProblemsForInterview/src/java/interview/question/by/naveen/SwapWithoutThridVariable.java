package java.interview.question.by.naveen;

public class SwapWithoutThridVariable {

	public static void main(String[] args) {
		
		int x=45;
		int y=10;
		
		//1. with using 3rd var
		/*
		 * int temp; 
		 * temp=x; 
		 * x=y; 
		 * y=temp;
		 */
		
		
		//2. without using 3rd var
		/*
		 * x=x+y;//15 
		 * y=x-y;//5 
		 * x=x-y;//10
		 */	
		
		//3. without using 3rd var :using * op		
		/*
		 * x=x*y; 
		 * y=x/y; 
		 * x=x/y;
		 */
		
		//4. using XOR
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("x="+x+"\ny="+y);
	}

}
