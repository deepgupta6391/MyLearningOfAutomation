package Java8.LambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {
		
		WebPage w1=new WebPage() {			
			@Override
			public void header(String val) {
				System.out.println("Hello "+val);				
			}
		};		
		w1.header("header");

		WebPage w2= (String name)->{
			System.out.println("hello "+name.length());
		};		
		w2.header("Sheela");
		
		WebPage w3=(name)->{
			System.out.println("hello "+name.toUpperCase());
		};		
		w3.header("Bekar");
		
		
		BeforeWebPage bw=(n,s)->{System.out.println("This is num "+n+" this is string "+s);};
		bw.beforeWP(78, "Google");
		
	}

}
