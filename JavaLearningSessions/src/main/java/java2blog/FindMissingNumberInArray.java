package java2blog;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] arr2={7,5,6,1,4,2};
		int[] arr1={5,3,1,2};
		int arrSum=0;
		int sum=0;
		int n=arr1.length+1;
		
		for(int i=0;i<arr1.length;i++) {
			arrSum=arrSum+arr1[i];
		}
		
		sum=n*(n+1)/2;
		
	
		
		System.out.println("Missing number is : "+(sum-arrSum));

	}

}
