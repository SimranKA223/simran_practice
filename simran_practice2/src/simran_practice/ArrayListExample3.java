package simran_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Threaddd1 extends Thread{
	@Override
	public void run() {
		synchronized(ArrayListExample3.list) {
			Iterator<String> it = ArrayListExample3.list.iterator(); 
			while(it.hasNext()) {
				System.out.print(it.next() + " ");
			}
		}
	}
	
}


class Threaddd2 extends Thread{
	@Override
	public void run() {
		synchronized(ArrayListExample3.list) {
			for(int i=100; i<106; i++) {
				ArrayListExample3.list.add(" T2 " + i);
			}
			System.out.println();
		}
	}
}

public class ArrayListExample3 {
	
	static List<String> list = Collections.synchronizedList(new ArrayList<>()) ;

	public static void main(String[] args) {
		
		Threaddd1 t1=new Threaddd1();
		
		Threaddd2 t2 = new Threaddd2();
		
		
		for(int i=1; i<6; i++) {
			list.add(" Main " + i);
		}
		t2.start();
		t1.start();

	}

}
