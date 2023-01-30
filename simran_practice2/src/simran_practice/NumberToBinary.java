package simran_practice;
import java.util.*;
public class NumberToBinary {
	
	static void sol(int n) {
		Stack<Integer> s = new Stack<>();
		while(n>0) {
			s.push(n%2);
			n=n/2;
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
		
	}

	public static void main(String[] args) {

		int n=4;
		sol(n);
		
	}

}
