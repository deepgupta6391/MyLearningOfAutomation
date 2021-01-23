package JavaBasics;

public class MethodChaining {

	public static void main(String[] args) {
		m1();
		MethodChaining obj1=new MethodChaining();
		obj1.NS1();
	}

	public static void m1() {
		m2();
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		System.out.println("Bye");
	}

	public void NS1() {
		NS2();
		m2();
	}

	public void NS2() {
		
		this.NS3();
	}

	public void NS3() {
		this.NS4();
	}

	public void NS4() {
		System.out.println("HEYYY");
	}
}
