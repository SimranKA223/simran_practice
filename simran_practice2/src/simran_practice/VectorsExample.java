package simran_practice;

import java.util.Iterator;
import java.util.Vector;

class Threadddd1 extends Thread{
	@Override
	public void run() {
		Iterator<String> it = VectorsExample.list.iterator(); 
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}


class Threadddd2 extends Thread{
	@Override
	public void run() {
		for(int i=100; i<106; i++) {
			VectorsExample.list.add(" T2 " + i);
		}
		System.out.println();
	}
}

public class VectorsExample {
	
	static Vector<String> list = new Vector<>();

	public static void main(String[] args) {
		Threadddd1 t1=new Threadddd1();
		
		Threadddd2 t2 = new Threadddd2();
		
		
		for(int i=1; i<6; i++) {
			list.add(" Main " + i);
		}
		t2.start();
		t1.start();	

	}

}
