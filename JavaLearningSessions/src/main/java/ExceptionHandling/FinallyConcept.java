package ExceptionHandling;

public class FinallyConcept {

	public static void main(String[] args) {

		// 1. Example 1
//		System.out.println("A");
//		try {
//			int i = 9 / 0;
//			// connect to DB
//			// get the data from DB -- exception is coming ...
//		} catch (Exception e) {
//			System.out.println("some exception is coming...");
//			e.printStackTrace();
//		} finally {
//			System.out.println("disconnect to DB");
//			System.out.println("Run this line...");
//		}

		// 2. Example 2

//		int p=20;
//		try {
//			System.out.println("in try block...");
//			int t=p/0;
//		}
//		catch (NullPointerException e) {
//			System.out.println("in ctach block...");
//			System.out.println("null pointer is coming...");
//		}
//		finally {
//			System.out.println("get lost......");
//		}
//		
//		System.out.println("Bye!!!");

		// 3. Example 3
		System.out.println(getMarks("tom"));
	}

	public static int getMarks(String name) {
		if (name.equals("tom")) {
			try {
				int i = 9 / 0;
			} catch (Exception e) {
				return 98;
			}
			finally {
				System.out.println("Bye");
				return 100;
			}
//			try {
//				int p=10/0;
//				return 95;
//			}catch (Exception e) {
//				return 65;
//			}finally {
//				return 80;
//			}

		} else if (name.equals("peter")) {
			return 90;
		} else {
			System.out.println("name is not found");
			return -1;
		}
		

	}
}
