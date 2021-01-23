package java2blog;

public class FindSubArraysWithGivenSumInAnArray {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 6, 4, 9, 0, 11 };
		int num = 9;
		// substringSum(arr, num);
		substringSolveEfficient(arr, num);
	}

	public static void substringSum(int arr[], int num) {
		for (int start = 0; start < arr.length; start++) {
			int sum = 0;
			for (int end = start; end < arr.length; end++) {
				sum += arr[end];
				if (sum == num) {
					System.out.println("Starting index : " + start + " , Ending index : " + end);
				}
			}
		}
	}

	public static void substringSolveEfficient(int arr[], int num) {

		int start = 0, end = 0;
		int currSum = 0;

		while (start < arr.length && end < arr.length) {
			if (currSum == num) {
				System.out.println("Starting index : " + start + " , Ending index : " + (end-1));
				if (end <= arr.length - 1) {
					currSum += arr[end];
				}
				end++;
			} else {
				if (currSum > num) {
					currSum -= arr[start];
					start++;
				} else {
					if (end <= arr.length - 1) {
						currSum += arr[end];
					}
					end++;
				}
			}

		}
	}

}
