package java.interview.question.by.naveen;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int numbers[]= {-10,24,50,-88,987656};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		//Time complexity O(n)
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		
		System.out.println("Given array is :: "+Arrays.toString(numbers));
		System.out.println("Largest number is ::"+largest);
		System.out.println("Smallest number is ::"+smallest);
		
		
	}

}
