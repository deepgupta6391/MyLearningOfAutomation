package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexForIPAddress {
//Learn
	public static void main(String[] args) {
		String zeroTo255="0";
		String s="000.12.12.034";
		String s1="000.12";
		String pattern="\\d{1,3}"+"\\."+"\\d{1,2}"+"\\."+"\\d{1,2}"+"\\."+"\\d{1,3}";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(s);
		System.out.println(m.matches());
		
	}

}
