package simran_practice;

public class CheckIfFibonacci {
	
	static boolean isFib(int x) {
		return (perfectSquare(5*x*x+4) || perfectSquare(5*x*x-4));
		
	}
	
	static boolean perfectSquare(int n) {
		int sqrt=(int)Math.sqrt(n);
		if(sqrt*sqrt==n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int x=13;
		System.out.println(isFib(x));

	}

}
