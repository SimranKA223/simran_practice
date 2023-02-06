package simran_practice;


interface Vehicle {
	public final int x = 10;
	void show();
}

class Car implements Vehicle{
	
	
	public void show() {
		
		
		System.out.println("I'm a car");
	}
}

   

public class InterfacesExample {


	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.show();
		
		System.out.println(obj.x);

	}

}
