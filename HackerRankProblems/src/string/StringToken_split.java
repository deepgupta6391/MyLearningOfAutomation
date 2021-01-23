package string;

import java.util.Arrays;

public class StringToken_split {

	public static void main(String[] args) {
		String s="He is a very very good boy, isn't + he?";
		
		String arr[]=s.split("[ '.,?!]+");
	

		for(String a:arr) {
			System.out.println(a);
		}
	}

}
