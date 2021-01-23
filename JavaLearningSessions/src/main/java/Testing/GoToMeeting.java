package Testing;

import Test.Meeting;

public class GoToMeeting extends Meeting{
	
	
	public GoToMeeting(int id, String password) {
		super(id, password);
		
	}

	public static void main(String[] args) {
		
		Meeting m=new Meeting(6721, "password");
		
		System.out.println(m.id);
		m.start();
		
		GoToMeeting go=new GoToMeeting(4555,"123456");
		System.out.println(go.isRecorded);
		System.out.println(go.id);
		go.start();
		

	}

}
