package strings;

public class SwapOddsAndEvensplace {

	public static void main(String[] args) {
		String s="welcomes";
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<s.length();i=i+2) {
			sb.append(s.charAt(i));
			sb.append(s.charAt(i-1));
		}
		if(s.length()%2!=0) {
			sb.append(s.charAt(s.length()-1));
		}
		System.out.println(sb);

	}

}