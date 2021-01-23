package arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		//String[] strs = { "flower", "flow", "flight" };
		 String[] strs = { "aacc", "aaa", "aaba" };
		//String[] strs= {"Hello"};

		if (strs.length < 1) {
			System.out.println("Don't execute");
		} else if (strs.length == 1) {
			System.out.println(strs[0]);
		} else {

			int min = Integer.MAX_VALUE;

			for (String s : strs) {
				min = Math.min(min, s.length());
			}
			System.out.println("Minimun length is " + min);

			System.out.println(findLongestPrefix(strs, min));
		}
	}

	//{ "aacc", "aaa", "aaba" };
	public static String findLongestPrefix(String[] strs, int min) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < min; i++) {

			for (int j = 0; j < strs.length - 1; j++) {
				if (strs[j].charAt(i) != strs[j + 1].charAt(i))
					return sb.toString();
				if (j == strs.length - 2)
					sb.append(strs[j].charAt(i));
			}

		}
		System.out.println(sb);
		return sb.toString();
	}

}
