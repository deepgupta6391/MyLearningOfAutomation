package arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
//		int nums[]= {1,3,5,6};
//		int target=7;		

		int nums[] = { 1, 3, 5, 6 };
		int target = 5;
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (target < nums[i])
				break;
			else if (target == nums[i])
				index = i;
			else
				index = i + 1;
		}

		System.out.println(index);

	}

}
