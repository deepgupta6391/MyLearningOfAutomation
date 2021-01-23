package JavaBasics;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		//++ --
		int i=1;
		int j=i++;
		System.out.println(i);//2
		System.out.println(j);//1
		System.out.println("**********************");
		int m=1;
		int n=++m;//pre increment
		System.out.println(m);//2
		System.out.println(n);//2
		System.out.println("**********************");
		int h=2;
		int g=h--;//post increment
		System.out.println(h);//1
		System.out.println(g);//2
		System.out.println("**********************");
		int c=2;
		int d=--c;//pre decrement
		System.out.println(c);//1
		System.out.println(d);//1
		
		int total=100;
		System.out.println(total++);//100
		System.out.println(total);//101
		
		int bal=99;
		System.out.println(++bal);//100
		
		double d1=99.99;
		System.out.println(++d1);
		
		char c1='a';//97
		System.out.println(++c1);//98
		
		boolean b1=true;
		//System.out.println(++b1);//compilation error
		
		
	}

}
