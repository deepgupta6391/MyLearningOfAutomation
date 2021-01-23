package java2blog;

public class PairInArrayWhoseSumIsClosestTox {

	public static void main(String[] args) {
		int num=5;
		int arr[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		int left = 0;
		int right = arr.length - 1;
		int minDiff = Integer.MAX_VALUE;
		int minLeft = left;
		int minRight = right;

		while(left<right) {
			int currDiff=Math.abs(arr[left]+arr[right]-num);
			if(currDiff<minDiff) {
				minDiff=currDiff;
				minLeft=left;
				minRight=right;
			}
			
			if (arr[left]+arr[right]<num)
				left++;
			else
				right--;
		}
		
		System.out.println("The pair whose sum is closest to X : "+arr[minLeft]+" "+ arr[minRight]);
	}

}


