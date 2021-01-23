package java2blog;

import java.util.Arrays;

public class Seperate0sAnd1sInArray_Sol2 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 1, 1, 0, 1 };
		int left=0;
		int right=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			while(arr[left]!=1) {
				left++;
			}
			while(arr[right]!=0) {
				right--;
			}
			if(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
