package java2blog;

import java.util.Arrays;

public class Seperate0sAnd1sInArray {
	
	static int age;

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 1, 1, 0, 1 };
		int updatedArr[] = new int[arr.length];
		int zerosCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zerosCount++;
			}
		}

		for (int i = 0; i < zerosCount; i++) {
			updatedArr[i] = 0;
		}
		for (int i = zerosCount; i < arr.length; i++) {
			updatedArr[i] = 1;
		}
		
		System.out.println(Arrays.toString(updatedArr));
		System.out.println(age);

	}

}
