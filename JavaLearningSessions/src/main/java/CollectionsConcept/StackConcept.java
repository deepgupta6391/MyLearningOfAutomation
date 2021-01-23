package CollectionsConcept;

import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		Stack stk = new Stack<>();

		// checking stack is empty or not
		System.out.println("Is the stack empty? " + stk.empty());

		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);

		// checking stack is empty or not
		System.out.println("Is the stack empty? " + stk.empty());
		
		System.out.println(stk);
		
		stk.push("Deeps");
		System.out.println(stk.push("Gupta"));
		
		System.out.println(stk);
		
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		
		System.out.println(stk);
		
		System.out.println("Location of 90 is : "+stk.search(90));
		System.out.println("The stack size is: "+stk.size());  
	}

}
