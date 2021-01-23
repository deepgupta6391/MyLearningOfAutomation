package java.interview.question.by.naveen;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num)
	{
		System.out.print("Prime number upto "+num+" : ");
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i))
			{
				System.out.print(i +" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//System.out.println(isPrimeNumber(81));
		//System.out.println(isPrimeNumber(101));
		getPrimeNumbers(40);
		getPrimeNumbers(55);
	}

}
