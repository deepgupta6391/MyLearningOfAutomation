package StringConcept;

//it is synchronized 
public class StringBufferConcept {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
//		sb.insert(1, "Deeps");
//		System.out.println(sb);  //HDeepsello
		
//		sb.replace(2, 4, "Lulala");
//		System.out.println(sb);  //HeLulalao
		
//		sb.delete(2, 4);
//		System.out.println(sb);  //Heo
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
