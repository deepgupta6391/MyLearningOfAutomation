package JavaBasics;

public class Travel {

	public static void main(String[] args) {

		Travel t = new Travel();
		t = null;

		// requesting JVM to call GC:
		System.gc();
		System.out.println("processing done");

	}

	@Override
	public void finalize() {//public and protected are allowed
		System.out.println("this is my finalize method");
	}

}
