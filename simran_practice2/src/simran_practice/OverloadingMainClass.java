package simran_practice;

public class OverloadingMainClass {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		main("Simran");
	}
	
	public static void main(String a) {
		System.out.println("Hi! " + a);
		main(22);
	}
	
	public static void main(int x) {
		System.out.println("Age: " + x);
	}
	
}
