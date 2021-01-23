package java.interview.question.by.naveen;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;
	
	public static void main(String[] args) {
		
		//1. case sensitive:
//		Object obj=null;
		
		//2. default ref value will be null
		/*
		 * System.out.println(obj);
		 *  System.out.println(str);
		 *   System.out.println(nc);
		 */
		
		
		//3.
		//Integer i=null;
		//int j=i;//not allowed

		//4. instanceof
		/*
		 * Integer i=null; 
		 * Integer j=10;
		 * 
		 * System.out.println(j instanceof Integer);
		 * System.out.println(i instanceof Integer);
		 */
		
		//5. static vs non static
		//NullConcept obj=null;
		//obj.send();
		//obj.sum();
		
		//6. == and !=
		System.out.println(null == null);
		System.out.println(null != null);
		
		//7. 
		String str=null;
		Integer i1=null;
		Double d1=null;
		
		String s1=(String)null;
		System.out.println(s1+"123");
		//System.out.println(s1.length());// Null pointer exception
		//System.out.println(s1.charAt(2));// Null pointer exception
	}
	
	public static void sum() {
		System.out.println("sum....");
	}
	
	public void send() {
		System.out.println("send...");
	}

}
