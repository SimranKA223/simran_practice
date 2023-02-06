package simran_practice;

class One{
	interface demo{
		
		public void show();
		
	}
}

class Two implements One.demo{
	
	public void show() {
		System.out.println("Hello");
	}
	
	
}

public class InterfacesExample2 {

	public static void main(String[] args) {
		
		One.demo obj=new Two();
		obj.show();

	}

}
