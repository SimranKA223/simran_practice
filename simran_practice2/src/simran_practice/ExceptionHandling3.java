package simran_practice;

/*
 * throws-used for exception handling without try & catch block
 *  throw- used to transfer control from the try block to the catch block. 
 */

public class ExceptionHandling3 {
	
	static void fun() throws IllegalAccessException{
		System.out.println("Hello!  I'm a function");
	}

	public static void main(String[] args) {
		
		try {
			fun();

		}
		catch(IllegalAccessException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}

	}

}
