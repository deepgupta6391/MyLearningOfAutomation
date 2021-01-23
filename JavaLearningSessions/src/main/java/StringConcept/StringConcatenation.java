package StringConcept;

public class StringConcatenation {

	public static void main(String[] args) {
		String x="Hello";
		String y="Selenium";
		
		int a=100;
		int b=200;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println("Sum of a and b"+a+b);
		
		char c1='a';//97
		char c2='b';//98
		System.out.println(c1+c2);//195
		System.out.println(c2-c1);//1
		System.out.println(c1-c2);//-1
		
		//0-9:48-57
		//a-z:97-122
		//A-Z:65-90
		
		double d1=12.33;
		double d2=22.33;
		
		System.out.println(a+b+d1+d2+x+y);//334.65999999999997HelloSelenium
		
		
		char d3='a';//97
		char d4='b';//98
		System.out.println(d3);//a
		System.out.println(d3+d4);//195
		
		//ASCII Range: Important
		//a-z:97-122
		//A-Z:65-90
		//0-9:48-57
		
		System.out.println(5/2);//2 because both are pure integer
		System.out.println(5.0/2);//2.5
		System.out.println(5/2.0);//2.5
		

	}

}
