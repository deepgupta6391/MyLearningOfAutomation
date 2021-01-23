package LambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {

//		WebPage w1 = new WebPage() {
//
//			@Override
//			public void header(String value) {
//				System.out.println("Hi " + value);
//
//			}
//		};
//    Below is the lambda expression for above

//		WebPage w1 = (value) -> {System.out.println("Hi " + value);};
//		WebPage w2 = (String value) -> {System.out.println(value.toUpperCase());};
//		WebPage w3 = (value) -> System.out.println(value.toUpperCase());
		WebPage w4 = (value, age) -> System.out.println("hi " + value + " age " + age);
		WebPage w5 = (String value,int age)-> System.out.println(value+"  "+age);
		
		
//		w1.header("google");
//		w2.header("facebook");
//		w3.header("Deeps");
		w4.header("deeps", 10);
		
		
	}

}
