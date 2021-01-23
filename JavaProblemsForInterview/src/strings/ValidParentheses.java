package strings;


import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String s = "()";
		
		if(s.length()%2!=0)
			System.out.println(false);
		else {
			Stack<Character> stack=new Stack<Character>();
			for(char c:s.toCharArray()) {
				if (c == '(' || c == '[' || c == '{') {
					stack.push(c);
				} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				}			
					
			}
			
			System.out.println(stack.isEmpty());
		}

	}

}
