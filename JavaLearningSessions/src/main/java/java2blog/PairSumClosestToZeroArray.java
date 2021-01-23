package java2blog;

public class PairSumClosestToZeroArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, -5, 7, 8, 20, -40, 6 };
		int pair1stIndex = 0;
		int pair2ndIndex = 1;
		int sumMin = arr[0] + arr[1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] + arr[j]) < Math.abs(sumMin)) {
					pair1stIndex = i;
					pair2ndIndex = j;
					sumMin = arr[i] + arr[j];
				}
			}
		}

		System.out.println(" The pair whose sum is closest to zero : " + arr[pair1stIndex] + " and " + arr[pair2ndIndex]);

	}

}
