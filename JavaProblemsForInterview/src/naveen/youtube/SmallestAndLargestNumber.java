package naveen.youtube;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int numbers[]= {-10,56,-90,700,4,-88};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(largest<numbers[i]) {
				largest=numbers[i];
			}else if(smallest>numbers[i]) {
				smallest=numbers[i];
			}
		}
		
		System.out.println("Given array is : "+Arrays.toString(numbers));
		
		System.out.println("Smallest number is : "+smallest+" Largest number is : "+largest);

	}

}
