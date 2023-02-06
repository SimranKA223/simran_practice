package simran_practice;

import java.util.Stack;

public class ValidParenthesis {
	
	static boolean isValid(String str) {
		
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{') {
				s.push(str.charAt(i));
			}
			else if(!s.empty() && str.charAt(i)==')' && s.peek()=='(') {
				s.pop();
			}
			else if(!s.empty() && str.charAt(i)==']' && s.peek()=='[') {
				s.pop();
			}
			else if(!s.empty() && str.charAt(i)=='}' && s.peek()=='{') {
				s.pop();
			}
			else {
				return false;
			}
			
		}
		
		return s.empty();
		
	}

	public static void main(String[] args) {
		
		System.out.println(isValid("((()))"));
		System.out.println(isValid("(({)})"));
		System.out.println(isValid("((())){}{[]}"));

	}

}
