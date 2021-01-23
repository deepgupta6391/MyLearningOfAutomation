package JavaBasics;

public class MaxNumbers {

	public static void main(String[] args) {
		
		int x=200;
		int y=-200;
		int z=100;
		
		if(x>y && x>z) {
			System.out.println("x is the highest");
		}else if(y>z) {
			System.out.println("y is the highest");
		}else if(z>x && z>y){
			System.out.println("z is the highest");
		}else {
			System.out.println("All numbers are same");
		}

	}

}
