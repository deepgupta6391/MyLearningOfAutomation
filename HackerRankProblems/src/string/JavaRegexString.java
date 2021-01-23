package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexString {

	public static void main(String[] args) {
		String s1="Julia";
		String s2="Samantha";
		String s3="1Samantha";
		String s4="Samantha_21";
		String s5="Samantha?10_2A";
		String p1="^[A-Za-z]{1}\\w{7,29}$";
		
		Pattern p=Pattern.compile(p1);
		Matcher m=p.matcher(s4);
		System.out.println(m.matches());

	}

}
