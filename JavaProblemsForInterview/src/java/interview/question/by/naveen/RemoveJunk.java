package java.interview.question.by.naveen;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s="ç§?ã?®å??å‰?ã?¯ãƒ‡ã‚£ãƒ¼ãƒ—ã‚·ã‚«ã?§ã?™  &&& is a String 923831200";
		
		//Regular ex:[^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]","");

		System.out.println(s);
		
	}
	

}
