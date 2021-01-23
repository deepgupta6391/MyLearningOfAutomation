package java2blog;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 9, 5, 6, 8, 4, 2 };
		int largestNum = Integer.MIN_VALUE;
		int secLargestNum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > largestNum) {
				secLargestNum = largestNum;
				largestNum=arr[i];
			} else if (arr[i] > secLargestNum & arr[i]!=largestNum) {
				secLargestNum=arr[i];
			}
		}

		System.out.println(secLargestNum);

	}

}
