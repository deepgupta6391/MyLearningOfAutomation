package JavaConversions;

public class ToInteger {

	public static void main(String[] args) {
		
		//convert string to int
		String s="200";  
		int i=Integer.parseInt(s);
		System.out.println(i);

		int j=Integer.valueOf(s);
		System.out.println(j);
		
		System.out.println("**********************");
		
		//convert long to int
		long l=500;  
		int k=(int)l;  
		System.out.println(k);  
		
		Long l1= new Long(10);  
		int k1=l1.intValue();  
		System.out.println(k1);  
		
		System.out.println("**********************");
		
		//Java double to int Example: Typecasting
		double d=10.5;  
		int i2=(int)d;  
		System.out.println(i2);  
		
		
		Double d1=new Double(10.5);  
		int i3=d1.intValue();  
		System.out.println(i3); 
		
		System.out.println("**********************");
		
		//Java char to int Example: Get ASCII value
		char c='a';  
		char c2='1';  
		int a=c;  
		int b=c2;  
		System.out.println(a);  
		System.out.println(b);  
	
		char c1='1';  
		int a1=Character.getNumericValue(c1);  
		System.out.println(a1);  
		
		int a2=Integer.parseInt(String.valueOf(c1));  
		System.out.println(a2);  
	}

}
