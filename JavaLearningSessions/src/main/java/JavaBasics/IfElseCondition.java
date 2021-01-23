package JavaBasics;

public class IfElseCondition {

	public static void main(String[] args) {
		//Dead code:
		if(true) {
			System.out.println("Pass");
		}else {
			System.out.println("False");
		}
			
		
		//not a dead code as the compiler will check the condition
		boolean t=false;
		if(t) {
			System.out.println("testttt");
		}else {
			System.out.println("heyyyy");
		}

		char c1='a';
		if(c1==97) {
			System.out.println("hey");
		}
		
		
	}

}
