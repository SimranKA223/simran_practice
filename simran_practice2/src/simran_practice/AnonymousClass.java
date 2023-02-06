package simran_practice;
import java.util.*;
/*
 * Anonymous class is an inner class that is declared without using a class name.
 * It is always an inner class.
 * we on the spot create an instance of the anonymous class.
 */

class Greetings{
	 void greet() {
		System.out.println("Greet");
	}
}

class India extends Greetings{
	
	//Anonymous class
	Greetings g = new Greetings() {
		 void greet() {
			System.out.println("Namaste");
		}
	};
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		India india=new India();
		india.g.greet();
	}

}
