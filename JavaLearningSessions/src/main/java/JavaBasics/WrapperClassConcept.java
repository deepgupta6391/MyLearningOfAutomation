package JavaBasics;

public class WrapperClassConcept {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20);
		
		//data conversion: String to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Boolean
		
		//String to double conversion:
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		
		//STring to boolean:
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//int to string conversion:
		int j=200;
		String s=String.valueOf(i);
		System.out.println(s+20);
		
		

	}

}
