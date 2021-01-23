package JavaBasics;

public class ConstructorOverloading {

	// class variables
	String name;
	int age;
	int userid;
	char gender;
	boolean isActive;
	static int wheels;

	// Constructor:

	public ConstructorOverloading() {
		System.out.println("default or 0 param const....");
	}

	public ConstructorOverloading(int i) {
		System.out.println("1 param const....");
	}

	public ConstructorOverloading(int i, String p) {
		System.out.println("2 param const....");
	}

	public ConstructorOverloading(String name, int age, int userid,int wheels) {
		super();
		this.name = name;
		this.age = age;
		this.userid = userid;
		this.wheels=wheels;//can do but with warning
	}

	public ConstructorOverloading(String name, int age, int userid, char gender, boolean isActive) {
		super();
		this.name = name;
		this.age = age;
		this.userid = userid;
		this.gender = gender;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading u2 = new ConstructorOverloading(30, "this is string");
		ConstructorOverloading us1 = new ConstructorOverloading("Deeps", 29, 345, 'F', true);
		System.out.println(us1.name);
		ConstructorOverloading us2=new ConstructorOverloading("Tom", 25, 687, 4);
		System.out.println(us2.wheels);
		
		
	}
	
	public static void test() {
		
	}

}
