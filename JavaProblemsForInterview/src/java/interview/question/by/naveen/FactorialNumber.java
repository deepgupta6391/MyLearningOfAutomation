package java.interview.question.by.naveen;

public class FactorialNumber {

	//1. without using recursion
	public static void fact(int num) {

		int factNum = 1;

		for (int i = num; i > 0; i--) {
			factNum = factNum * i;
		}
		System.out.println(factNum);
	}

	public static int recurFact(int n) {
		
		if (n==0)
			return 1;
		else
			return (n*recurFact(n - 1));
	}

	public static void main(String[] args) {

		//fact(1);
		int factNum=recurFact(1);
		System.out.println(factNum);

	}

}
