package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(nums1));
	}

	public static int missingNumber(int[] nums) {

		int n=nums.length;
		int sum=n*(n+1)/2;
		int resSum=0;
		for(int i=0;i<nums.length;i++) {
			resSum+=nums[i];
		}
		int missNum=sum-resSum;
		return missNum;
	}

}
