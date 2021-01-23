package StringConcept;

//It is non-synchronized
public class StringBuilderConcept {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");
//		sb.append("Java");
//		System.out.println(sb);//HelloJava
//		sb.insert(3, "Jiten");
//		System.out.println(sb);//HelJitenloJava
		
//		sb.replace(1, 3, "Java");
//		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);//olleH
		System.out.println(sb.delete(1, 4));//oH

	}

}
