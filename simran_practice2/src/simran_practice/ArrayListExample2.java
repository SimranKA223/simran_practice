package simran_practice;

import java.util.ArrayList;
import java.util.Iterator;

class Thread1 extends Thread{
	@Override
	public void run() {
		Iterator<String> it = ArrayListExample2.list.iterator(); 
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}


class Threadd2 extends Thread{
	@Override
	public void run() {
		for(int i=100; i<106; i++) {
			ArrayListExample2.list.add(" T2 " + i);
		}
		System.out.println();
	}
}

public class ArrayListExample2 {
	
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		Threadd2 t2 = new Threadd2();
		t2.start();
		t1.start();
		for(int i=15; i<21; i++) {
			list.add(" Main " + i);
		}
		
		
		
		

	}

}
