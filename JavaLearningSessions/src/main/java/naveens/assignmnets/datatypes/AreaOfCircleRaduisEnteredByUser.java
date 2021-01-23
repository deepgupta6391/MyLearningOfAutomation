package naveens.assignmnets.datatypes;

import java.util.Scanner;

public class AreaOfCircleRaduisEnteredByUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		int r=sc.nextInt();
		
		//double area=AreaOfCircle(r);
		//double circum=CircumferenceOfCircle(r);
		
		System.out.println("Area of circle is : "+AreaOfCircle(r));
		System.out.println("Circumference if circle is :"+CircumferenceOfCircle(r));
	}

	public static double AreaOfCircle(int r) {
		return(3.14*r*r);
	}
	
	public static double CircumferenceOfCircle(int r) {
		return(2*3.14*r);
	}
}
