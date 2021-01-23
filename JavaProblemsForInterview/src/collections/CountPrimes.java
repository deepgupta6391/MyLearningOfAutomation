package collections;

import java.util.ArrayList;

public class CountPrimes {

	public static void main(String[] args) {
		//int n = 499979;
		int n=10;
		System.out.println("Total prime numbers less than " + n + " are : " + countPrimes(n));
	}

	public static int countPrimes(int n) {

		boolean[] notPrime=new boolean[n];
		int count =0;
		for(int i=2;i<n;i++) {
			if(notPrime[i]==false)
				count++;
			for(int j=2;i*j<n;j++) {
				notPrime[i*j]=true;
			}
		}
		return count;
	}
}
