package simran_practice;

class Aa extends Thread{

	@Override
	public void run() {
		for(int i=0; i<11; i++) {
			System.out.println("Thread A " + i);
		}
	}
	
}

class Bb extends Thread{

	@Override
	public void run() {
		for(int i=0; i<11; i++) {
			System.out.println("Thread B " + i);
		}
	}
	
}

public class Thread2 {

	public static void main(String[] args) {

		Aa obj = new Aa();
		Bb obj2 = new Bb();
		
		obj.start();
		obj2.start();
		
	}

}
