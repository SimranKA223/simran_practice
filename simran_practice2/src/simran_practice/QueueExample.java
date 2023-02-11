package simran_practice;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueExample {
	

	public static void main(String[] args) {
		
		//queue is an interface,so objects cannot be created. We will need class which implements the the interface.

		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<6; i++) {
			q.add(i);
		}
		System.out.println(q);
		
		System.out.println(q.remove()); //removes head
		System.out.println(q.remove(4));//returns true and then removes the value 4.
		System.out.println(q.remove(6));//returns false 
		System.out.println(q);
		
		System.out.println(q.peek()); //shows head
		
		System.out.println(q.poll());
		
		Queue<Integer> qnull = new LinkedList<>();
		System.out.println(qnull.poll());
		//System.out.println(qnull.remove()); //exception:- No such element exception
		
		Queue<String> qu = new LinkedList<>();
		qu.add("Mango");
		qu.add("Apple");
		qu.add("green");
		qu.add("papaya");
		qu.remove("Apple"); //just removes the value.
		System.out.println(qu);
		qu.remove("Grapes");
		System.out.println(qu);
		
		//Iterate
		Iterator it = qu.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
			//qu.remove(); //-Exception:-Concurrent Modification. because it is not thread safe.
		}
		
		//priority Queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method- Inserts the specified element to the queue. If the queue is full, it throws an exception.
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method- Inserts the specified element to the queue. If the queue is full, it returns false.
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
        
        //priority blocking queue:-Thread safe
        Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();

    
        pbq.add(100);
        pbq.add(110);
        pbq.add(120);
        pbq.add(130);

        System.out.println(pbq.peek());
	    System.out.println(pbq.poll());
	    System.out.println(pbq.peek());
	    
	    System.out.println(pbq);
	    
	    Iterator itt = pbq.iterator();
		while(itt.hasNext()) {
			System.out.print(itt.next() + " ");
			pbq.remove(); //-No Exception:-Concurrent Modification. because it is thread safe.
		}
		System.out.println(pbq);
		
		//Deque Interface-supports addition and removal from either end
		
		Deque<Integer> deque = new LinkedList<>();
		
		deque.addFirst(1);
		deque.add(2); //add last
		deque.push(3); //add first
		deque.offer(4); //add last
		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
	    

	}

}
