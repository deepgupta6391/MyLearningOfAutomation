package Testing;

import Test.Meeting;

public class WebExMeeting {

	public static void main(String[] args) {
		
		Meeting m=new Meeting(1234321, "test1234");
		System.out.println(m.id);
		m.start();
		

	}

}
