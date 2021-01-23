package strings;

public class AddTwoBinarys {

	public static void main(String[] args) {
		String a="11";
		String b="1";

		addBinary(a,b);
	}
	
	public static void addBinary(String a,String b) {
		
		String result="";
		
		int s=0;
		
		int i=a.length()-1;
		int j=b.length()-1;
		while(i>=0 || j>=0 ||s==1) {
			
			s=s+((i>=0)? a.charAt(i)-'0':0);
			s=s+((j>=0)? b.charAt(j)-'0':0);
			
			result=(char)(s%2 +'0') +result;
			//System.out.println(result);
			
			s=s/2;
			//System.out.println(s);
			i--;
			j--;
			
		}
		System.out.println(result);
	}

}
