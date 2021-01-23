package JavaBasics;

public class MethodChaining1 {

	String name;
	int age;


	public MethodChaining1 setName(String name) {
		this.name = name;
		return this;
	}

	
	public MethodChaining1 setAge(int age) {
		this.age = age;
		return this;
	}

	
	public void display() {
		System.out.println("name is "+name+" and age is "+age);
	}

	public static void main(String[] args) {
		
		MethodChaining1 cc=new MethodChaining1();
		cc.setName("Deeps").setAge(25).display();
	
	}

}
