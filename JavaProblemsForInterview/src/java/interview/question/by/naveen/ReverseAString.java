package java.interview.question.by.naveen;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String strToRev=scan.nextLine(); 

		// 1. Using for loop
		/*
		 * String revString=""; 
		 * for(int i=strToRev.length()-1;i>=0;i--) {
		 * 
		 * revString=revString+strToRev.charAt(i);
		 * 
		 * } System.out.println(revString);
		 */

		// 2.Using String Buffer
		StringBuffer sb = new StringBuffer(strToRev);
		System.out.println(sb.reverse());
	}
}
