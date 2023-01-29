package simran_practice;

class Base{
	
	String a;
	
	Base(){
		
		System.out.println("Base class 1st");
	}
	
	Base(String a){
		this.a=a;
		System.out.println("Hi! "+ a);
	}
	
}

class Derived extends Base{
	
	Derived(){
		super();
		System.out.println("Derived class 1st");
	}
	
	Derived(String a){
		super(a);
		
	}
	
}

public class ConstructorChainingTwo {

	public static void main(String[] args) {
		
		Derived ob=new Derived("Donna");

	}

}
