package arrays;

public class LongestCommonPrefix_2 {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" ,"flow"};
		if(strs.length==0) {
			System.out.println("");
		}else {
			String prefix=strs[0];
			for(int i=1;i<strs.length;i++) {
				while(strs[i].indexOf(prefix)!=0) {
					prefix=prefix.substring(0,prefix.length()-1);
				}
			}
			
			System.out.println(prefix);
		}
		
		
	}

}
