package java.interview.question.by.naveen;

public class MissingNumber {

	public static void main(String[] args) {
		
		//int a[]= {1,2,4,5};
		//1+2+4+5=12
		//1+2+3+4+5=15
		//15-12=3
		
		int a[]= {-1,0,1,2,4,5,6,7,8,9,10};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1+=a[i];
		}
		
		System.out.println(sum1);
		
		int sum2=0;
		for(int j=-1;j<=10;j++) {
			sum2+=j;
		}
		
		System.out.println(sum2);
		
		System.out.println("Missing number is::: "+(sum2-sum1));
	}
}
