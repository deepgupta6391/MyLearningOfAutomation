package naveen.youtube_basictoadvance_86questions.part2;

public class NumberOfDigitsInInteger {

	public static void main(String[] args) {
		
		long num=827191682l;		
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		
		System.out.println("Length of integer is : "+count);

	}

}
