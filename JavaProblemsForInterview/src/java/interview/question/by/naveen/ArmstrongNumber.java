package java.interview.question.by.naveen;

public class ArmstrongNumber {
	
	public static void isArmStrong(int num) {
		
		int cube=0;
		int temp=num;
		int r;
		
		while(num>0) {
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(temp==cube)
			System.out.println(temp+" is armstrong number");
		else
			System.out.println(temp+" is not an armstrong number");
	}

	public static void main(String[] args) {
		
		isArmStrong(407);
		isArmStrong(371);
		isArmStrong(455);
	}
	
}
