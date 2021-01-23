package JavaConversions;

public class ToString {

	public static void main(String[] args) {
		int a=10;
		String s=String.valueOf(a);
		System.out.println(s);

		String s1=Integer.toString(a);
		System.out.println(s1);
		
		String s2=String.format("%d", a);
		System.out.println(s2);
		
		
		
		
		//Long to String
		long i=9993939399L;//L is the suffix for long  
		String s3=String.valueOf(i);//Now it will return "9993939399"  
		System.out.println(s3);
		String s4=Long.toString(i);
		System.out.println(s4);
		
		
		
		//Float to string
		float f=12.3F;//F is the suffix for float  
		String s5=String.valueOf(f);  
		System.out.println(s5);
		float f1=89.7F;  
		String s6=Float.toString(f1);  
		
		
		//Double to string
		double d=12.3;//floating literal is double by default  
		String s7=String.valueOf(d);  
		double d1=89.7;  
		String s8=Double.toString(d1);  
		
	}

}
