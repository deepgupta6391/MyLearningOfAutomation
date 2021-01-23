package strings;

public class StudentAttendanceRecord1 {

	public static void main(String[] args) {
		String s1 = "PPALLP";
		String s2 = "PPALLL";
		System.out.println(checkRecord(s1));
		System.out.println(checkRecord(s2));
	}

	public static boolean checkRecord(String s) {
		int countA = 0, countContL = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				countA++;
				countContL = 0;
			} else if (s.charAt(i) == 'L') {
				countContL++;
			} else {
				countContL = 0;
			}
			if (countA > 1 || countContL > 2)
				return false;
		}
		return true;
	}
}
