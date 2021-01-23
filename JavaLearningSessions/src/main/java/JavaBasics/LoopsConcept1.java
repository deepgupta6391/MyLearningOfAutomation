package JavaBasics;

public class LoopsConcept1 {

	public static void main(String[] args) {
		
		//a to z:
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		
		System.out.println("-----------------------------");
		
		for(double d=1.2;d<=10;d++) {
			System.out.println(d);
		}
		
		//dead code
//		while(false) {
//			System.out.println("Hi");
//		}
		
		boolean flag=false;
		while(flag) {
			System.out.println("Hi");
		}
	}

}
