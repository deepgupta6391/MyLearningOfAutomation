package java2blog;

import java.util.HashMap;

public class FindPairsOfElementsFromArrayWhoseSumIsGivenNumber {

	public static void main(String[] args) {
		int arr[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		int num = 15;
		int l = 0;
		int r = arr.length - 1;

		pairOfElementsWithWhile(arr, num, l, r);
		System.out.println("******************************");
		pairOfElementsWithFor(arr, num, l, r);
		System.out.println("*************************************");
		findPairsEqualsToXUsingHashing(arr,num);
	}

	static void pairOfElementsWithWhile(int arr[], int num, int l, int r) {

		while (l < r) {
			int temp = arr[l] + arr[r];
			if (temp == num) {
				System.out.println("Pair of elements are : " + arr[l] + " " + arr[r]);
			}
			if (temp < num) {
				l++;
			} else {
				r--;
			}

		}
	}

	static void pairOfElementsWithFor(int arr[], int num, int l, int r) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i] + arr[j];
				if (temp == num) {
					System.out.println("Pair of elements are : " + arr[i] + " " + arr[j]);
				}
			}
		}
	}

	public static void findPairsEqualsToXUsingHashing(int arr[], int X) {
		HashMap<Integer, Integer> elementIndexMap = new HashMap<Integer, Integer>();
		System.out.println("The pair whose sum is equal to 15 : ");
		for (int i = 0; i < arr.length; i++) {
			elementIndexMap.put(arr[i], i);
		}
		
		//System.out.println(elementIndexMap);
		for (int i = 0; i < arr.length; i++) {
			// we have used elementIndexMap.get(X-arr[i])!=i to avoid using same
			// element twice
			if (elementIndexMap.get(X - arr[i]) != null && elementIndexMap.get(X - arr[i]) != i) //
			{
				System.out.println(arr[i] + " " + (X - arr[i]));
			}
		}
	}

}
