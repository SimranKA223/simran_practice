package simran_practice;

//Java program to detect double and triple spaces

public class String4 {
	
	public static void main(String[] args) {
		String str = "This string contains double and  triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
	}

}
