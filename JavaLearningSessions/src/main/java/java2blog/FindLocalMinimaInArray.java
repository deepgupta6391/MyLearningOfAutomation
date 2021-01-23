package java2blog;

public class FindLocalMinimaInArray {

	public static int findLocalMinima(int[] arr, int start, int end) {

		int mid = start + (end - start) / 2;
		int size = arr.length;

		if (mid == 0 || (arr[mid - 1] > arr[mid]) && (mid == size - 1 || arr[mid + 1] > arr[mid])) {
			return arr[mid];
		} else if (arr[mid] > arr[mid - 1]) {
			return findLocalMinima(arr, start, mid);
		} else {
			return findLocalMinima(arr, mid + 1, end);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 10, 5, 3, 6, 13, 16, 7 };

		System.out.println("Local minima is : " + findLocalMinima(arr, 0, arr.length));

	}

}
