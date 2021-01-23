package java2blog;

import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int arr[] = { 2, 6, -1, 2, 4, 1, -6, 5 };
		int k = 3;

		//solveUsingForLoop(arr, k);
		//2nd methos need to check again
		solveUsingEfficientMethod(arr,k);
	}

	public static void solveUsingForLoop(int arr[], int k) {
		for (int i = k; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i - k; j < i; j++) {
				max=Math.max(max, arr[j]);
			}
			
			System.out.println(max);
		}
	}
	
	public static void solveUsingEfficientMethod(int arr[],int k) {
		
		LinkedList<Integer> deque=new LinkedList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			while(!deque.isEmpty() && arr[deque.getLast()]<=arr[i]) {
				deque.removeLast();
			}
			
			while(!deque.isEmpty() && deque.getFirst()<=(i-k)) {
				deque.removeFirst();
			}
			
			deque.addLast(i);
			
			if(i>=k-1) {
				System.out.println(" "+arr[deque.getFirst()]);
			}
		}
	}
	
}
