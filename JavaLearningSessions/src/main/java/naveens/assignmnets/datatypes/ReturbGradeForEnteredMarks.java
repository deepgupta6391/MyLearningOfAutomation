package naveens.assignmnets.datatypes;

import java.util.Scanner;

public class ReturbGradeForEnteredMarks {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter students marks : ");
		int marks = scan.nextInt();

		System.out.println("Students's grade is :"+getGrade(marks));
	}

	public static String getGrade(int marks) {
		if (marks >= 91 && marks <= 100) {
			return "AA";
		} else if (marks >= 81 && marks <= 90) {
			return "BB";
		} else if (marks >= 71 && marks <= 80) {
			return "CC";
		} else if (marks >= 61 && marks <= 70) {
			return "DD";
		} else if (marks >= 51 && marks <= 60) {
			return "EE";
		} else if (marks >= 41 && marks <= 50) {
			return "BB";
		} else {
			return "Fail";
		}

	}

}
