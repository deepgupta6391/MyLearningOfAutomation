package java2blog;

public class FindLargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int arr[] = new int[]{12,56,76,89,100,343,21,234};
		 int smallest = arr[0];
		 int largest = arr[0];
		 
		 for(int i=0;i<arr.length-1;i++) {
			 if(smallest>arr[i]) {
				 smallest=arr[i];
			 }else if(largest<arr[i]) {
				 largest=arr[i];
			 }			 
		 }
		 
		 System.out.println("Smallest number is : "+smallest);
		 System.out.println("Largest number is : "+largest);

	}

}
