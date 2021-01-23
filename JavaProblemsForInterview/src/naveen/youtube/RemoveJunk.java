package naveen.youtube;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="これは問題ではありません this is testing 3828390";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
