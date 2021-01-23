package naveen.youtube;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=19;
		//System.out.println(n + " is prime number --->"+isPrime(n));
		getPrimeNumbers(n);
	}
	
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int n) {
		for(int i=2;i<=n;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}

}
