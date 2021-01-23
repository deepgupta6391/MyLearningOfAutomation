package naveen.youtube_basictoadvance_86questions.part2;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=82645;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse of the given number is : "+rev);

	}

}
