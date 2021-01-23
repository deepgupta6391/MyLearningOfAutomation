package naveen.youtube_basictoadvance_86questions.part1;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		int x=700;
		int y=700;
		int z=300;
		
//		if(x>y && x>z) {
//			System.out.println(x+" is the greatest number");
//		}else if(y>z) {
//			System.out.println(y+" is the greatest number");
//		}else {
//			System.out.println(z+" is the greatest number");
//		}
		
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is the greatest");
			}else {
				System.out.println("z is the greatest");
			}
		}else {
			if(y>=z) {
				System.out.println(" y is the greatest");
			}else {
				System.out.println("z is the greatest");
			}
		}

	}

}
