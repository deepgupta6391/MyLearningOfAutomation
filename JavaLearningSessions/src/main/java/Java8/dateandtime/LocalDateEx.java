package Java8.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateEx {

	public static void main(String[] args) {
		
		LocalDate currDate=LocalDate.now();
		System.out.println(currDate);
		
		LocalTime currTime=LocalTime.now();
		System.out.println(currTime);
	}

}
