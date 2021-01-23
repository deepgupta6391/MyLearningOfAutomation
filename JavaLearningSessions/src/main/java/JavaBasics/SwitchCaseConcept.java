package JavaBasics;

public class SwitchCaseConcept {

	//String,int and char are allowed.
	public static void main(String[] args) {
		
		int num=10;
		switch (num) {
		case 10:
			System.out.println(10);			
			break;
			
		case 20:
			System.out.println(20);			
			break;

		default:
			System.out.println("Number not found");
			break;
		}


	}

}
