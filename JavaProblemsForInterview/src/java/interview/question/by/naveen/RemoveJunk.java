package java.interview.question.by.naveen;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s="�?�?��??�?�?�ディープシカ�?��?�  &&& is a String 923831200";
		
		//Regular ex:[^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]","");

		System.out.println(s);
		
	}
	

}
