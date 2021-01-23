package naveen.youtube;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="the rains have started here";
		String str1="the rains Have started here";
		
		System.out.println(str.length());
		System.out.println(str.charAt(7));
		System.out.println(str.indexOf('s'));//1st occurance of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));
		
		System.out.println("*************************");
		
		//string comparison:
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println("*************************");
		
		//substring:
		System.out.println(str.substring(0,9));
		
		//trim
		String s="        Hello world              ";
		System.out.println(s);
		System.out.println(s.trim());
		
		//replace
		System.out.println(s.replace(" ", ""));
		
		String date="01-01-2017";
		System.out.println(date.replace("-", "/"));
		
		//split
		String test="Hello_World_Test_Selenium";
		System.out.println(Arrays.toString(test.split("_")));
		
		String s2="cares";
		System.out.println(s2.concat("s"));
		
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y);
	}

}
