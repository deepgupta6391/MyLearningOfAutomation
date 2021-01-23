package basics;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 2147395600;
		System.out.println((int) Math.sqrt(2147395600));
		//System.out.println(sqRoot(x));
		System.out.println(calSqRoot(x));
	}

	public static int sqRoot(int x) {

		if (x == 0 || x == 1)
			return x;

		int start = 0, end = x, result = 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (mid * mid == x)
				return mid;
			if (mid * mid < x) {
				start = mid + 1;
				result = mid;
			} else {
				end = mid - 1;
			}
		}

		return result;
	}
	
	public static int calSqRoot(int x) {
		 // Base cases 
        if (x == 0 || x == 1) 
            return x; 
  
        // Staring from 1, try all numbers until 
        // i*i is greater than or equal to x. 
        long i = 1;
        long result = 1; 
          
        while (result <= x) { 
            i++; 
            result = i * i; 
        } 
        return (int)(i - 1); 
	}

}
