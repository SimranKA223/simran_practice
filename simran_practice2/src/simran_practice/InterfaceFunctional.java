package simran_practice;

interface Operation{
	
	public int perform(int x, int y);
}

class LamdaDemo{
	
	public void action(Operation ob) {
		System.out.println(ob.perform(10, 10));
	}
	
}

public class InterfaceFunctional {

	public static void main(String[] args) {
		
		
		Operation var=(int x, int y)->x+y;
		LamdaDemo ob = new LamdaDemo();
		ob.action(var);

	}

}
