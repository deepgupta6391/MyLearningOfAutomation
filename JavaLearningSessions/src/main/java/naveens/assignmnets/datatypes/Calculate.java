package naveens.assignmnets.datatypes;

public class Calculate {

	public static void main(String[] args) {
		
		int x=74;
		int y=36;
		
		int a=50;
		int b=3;
		
		System.out.println(sum(x, y));
		System.out.println(divide(a, b));
	}
	
	public static int sum(int x,int y) {
		return x+y;
	}
	
	public static int divide(int a,int b) {
		return (a/b);
	}

}
