package simran_practice;

class Aclass{
	
	String a;
	
	//main constructor
	Aclass(){
		this(5);
		System.out.println("non parameterized constructor");
	}
	
	Aclass(int x){
		this(2,5);
		System.out.println("value: " + x);
	}
	
	Aclass(int x, int y){
		this("Simran");
		System.out.println("value: "+ x+ " " +y);
	}
	
	Aclass(String a){
		System.out.println("Hello " + a);
	}
	
}



public class ConstructorChaining {
	
	public static void main(String[] args) {
		
		Aclass obj = new Aclass();
		
	}
}
