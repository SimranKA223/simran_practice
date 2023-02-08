package simran_practice;

class Xx implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<11; i++) {
			System.out.println("Thread X " + i);
		}
	}
	
}

class Yy implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<11; i++) {
			System.out.println("Thread Y " + i);
		}
	}
	
}

public class Threads1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Xx());
		Thread t2 = new Thread(new Yy());
		t1.start();
		t2.start();
		
	}

}
