package simran_practice;

/*
 When there are multiple functions with the 
 
 same name
 
 but different parameters 
 
 then these functions are said to be overloaded.
 
 Functions can be overloaded by 
 
 change in the number of arguments or/and 
 
 a change in the type of arguments.
 */

public class OverloadingOops {
	
	
	static int sum(int x, int y) {
		return x+y;
	}

	static int sum(int x, int y, int z) {
		return x+y+z;
	}

	static double sum(double x, double y) {
		return x+y;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(5,5));
		System.out.println(sum(5,5,5));
		System.out.println(sum(5.0,5.0));

	}

}
