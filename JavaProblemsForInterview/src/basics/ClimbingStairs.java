package basics;

public class ClimbingStairs {

	public static void main(String[] args) {

		int n = 5;

//		System.out.println("Using recursive : " +count(n));
		System.out.println("Non recursive : "+climbStairs(n));
	}


	public static int count(int n) {
		if (n == 1 || n == 0)
			return 1;
		else if (n == 2)
			return 2;

		return (count(n - 1) + count(n - 2));

	}

	public static int climbStairs(int n) {
		int[] cal=new int[n];
		
		cal[0]=1;
		cal[1]=2;
		
		for(int i=2;i<n;i++) {
			cal[i]=cal[i-2]+cal[i-1];
		}
		return cal[n-1];
	}
}	

