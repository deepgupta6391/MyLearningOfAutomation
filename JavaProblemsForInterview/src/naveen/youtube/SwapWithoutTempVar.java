package naveen.youtube;

public class SwapWithoutTempVar {

	public static void main(String[] args) {
		
		int x=35;
		int y=77;
		
		//using + operator
//		x=x+y;
//		y=x-y;
//		x=x-y;
		
		//using * operator
//		x=x*y;
//		y=x/y;
//		x=x/y;
		
		//using XOR
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("x is : "+x+" y is : "+y);

	}

}
