package string;

import java.util.regex.Pattern;

public class TagExtractorContent {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("<(.+)>([^<]+)</\\1>");

	}

}
