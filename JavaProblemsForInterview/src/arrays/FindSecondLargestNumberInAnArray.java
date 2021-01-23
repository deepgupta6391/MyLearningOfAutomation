package arrays;

public class FindSecondLargestNumberInAnArray {

	public static void main(String[] args) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		System.out.println(secondLargest(arr1));
	}

	public static int secondLargest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			}else if(arr[i]>secLargest && arr[i]!=largest){
				secLargest=arr[i];
			}

		}
		System.out.println(largest);
		return secLargest;

	}

}
