package naveen.youtube;

public class ArmstrongNumber {

	//153
	//1*1*1=1
	//5*5*5=125
	//3*3*3=27
	//1+125+27=153
	
	public static void isArmstrongNumber(int n) {
		
		int cube=0;
		int temp=n;
		int r;
		
		while(temp>0) {
			r=temp%10;
			temp=temp/10;
			cube+=(r*r*r);
		}
		
		if(n==cube) {
			System.out.println(n+" is an armstrong number");
		}else {
			System.out.println(n+" is not an armstrong number");
		}
	}
	
	public static void main(String[] args) {
		
		isArmstrongNumber(153);
		isArmstrongNumber(127);
		isArmstrongNumber(371);
		isArmstrongNumber(370);

	}

}
