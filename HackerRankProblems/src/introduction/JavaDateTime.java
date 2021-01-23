package introduction;

import java.util.Calendar;
import java.util.Locale;

public class JavaDateTime {

	public static void main(String[] args) {

		int month = 8;
		int date = 05;
		int year = 2015;

		Calendar cal = Calendar.getInstance();
		cal.set(Integer.valueOf(year), Integer.valueOf(month) - 1, Integer.valueOf(date));
		String res = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
		System.out.println(res);
	}

}
