package JavaBasics;

public class DataConvert {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);

		
		String y="12.33";
		System.out.println(y+100);
		
		double d=Double.parseDouble(y);
		System.out.println(d+100);
		
		String p="100A";
		System.out.println(p+100);
		
		//int k=Integer.parseInt(p);//NumberFormatException 
		String p1=p.replace("A", "");
		String p2=p.substring(0, p.length()-1);

		
		System.out.println(Integer.parseInt(p1)+200);
		System.out.println(Integer.parseInt(p2)+300);
		
		System.out.println("**********************************");
		
		//Integer to string conversion:
		int m=100;
		System.out.println(m+20);
		String n1=Integer.toString(m);
		System.out.println(m+n1);
		String n2=String.valueOf(m);
		System.out.println(m+n2);
		
		
	}

}
