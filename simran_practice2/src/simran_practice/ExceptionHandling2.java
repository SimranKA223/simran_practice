package simran_practice;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		//try, catch, finally


		int a = 10, b = 5, c = 5, ans;
        try {
            ans = a / (b - c);
            System.out.println("result" + ans);
        }
 
        catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero");
        }
 
        finally {
            System.out.println("final block.");
        }

	}

}
