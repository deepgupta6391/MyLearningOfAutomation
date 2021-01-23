package JavaBasics;

public class MainMethodOverloading {

	public static void main(String[] args) {
		
		main(10);
		
	}
	
	public static void main(int a) {
		System.out.println(a);
		main(20,30);
	}
	
	public static int main(int a,int b) {
		System.out.println(a+b);
		return b;
	}
	
	//not good approach and not methodoverloading
	public void login() {
		
	}
	
	//not good approach and not methodoverloading
	public static void login(int otp) {
		
	}

}
