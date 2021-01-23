package naveen.youtube_basictoadvance_86questions.part1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=65;
		int b=20;
		
		System.out.println("before swapping : ");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
//		System.out.println("after swapping using temp : ");		
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a :"+a+" b :"+b);

		System.out.println("swapping without temp");
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("a :"+a+" b :"+b);
		
	}

}
