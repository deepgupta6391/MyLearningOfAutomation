package java.interview.question.by.naveen;

import java.util.Arrays;

public class StringMaipulation {

	public static void main(String[] args) {

		String str = "The rains have started here selenium";
		String str1 = "ThE rains have started here selenium";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf('s'));// 1st occurrence of s
		System.out.println(str.lastIndexOf('s'));// last occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s') + 1));// 2nd occurrence of s

		int secondOccurrence = str.indexOf('s', str.indexOf('s') + 1);

		System.out.println(str.indexOf('s', (str.indexOf('s', str.indexOf('s') + 1) + 1))); // 3rd occurrence

		System.out.println(str.indexOf("me"));// returns -1 means not available
		System.out.println(str.indexOf("here"));

		// String comparison:
		System.out.println(str.equalsIgnoreCase(str1));

		System.out.println(str.equals(str1));

		// substring:
		System.out.println(str.substring(0, 9));

		// trim:
		String s = "       Hello World        ";
		String s1 = "       Hello World        ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));

		System.out.println(s1.replace(" ", ""));
		
		String date="07-20-2020";
		System.out.println(date.replace("-","/"));
		
		
		//split:
		String test="Hello_World_Test_Selenium";
		String testVal[]=test.split("_");
		
		System.out.println(Arrays.toString(testVal));
		//OR
		for(String val:testVal) {
			System.out.println(val);
		}
		
		
		//concatinate:
		System.out.println(s.concat(test));
		
		
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
	}

}
