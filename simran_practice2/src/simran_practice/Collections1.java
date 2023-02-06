package simran_practice;

import java.util.*;

public class Collections1 {

	public static void main(String[] args) {
		
		/*
		 
		 Array Vs ArrayList
		 
		 size: Array is fixed. ArrayList is dynamic;
		 speed: Array is faster because it is fixed in size.
		 Storage: Arrays can also store primitive data types. ArrayLists can only store objects.
		 
		 ArrayList are always references to objects at different memory locations. Therefore in ArrayList,
		 the actual objects are never stored at contiguous locations.
		 References of the actual objects are stored at contiguous locations. 
		 
		 */
		
		int[] arr= {1,2,3,4,5};

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.remove(2);
		
		
		System.out.println(l);
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		/*
		 ArrayLists and vectors both implement list interface.
		 
		 ArrayList is not synchronized. Vector is Synchronized.
		 It makes arraylist faster.
		 
		 Vector is a legacy class and arraylists are not.
		 
		 */
		
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement()+" ");
        }
        
     /*
      linked list is faster in manipulation 
      */
        
        LinkedList<String> st = new LinkedList<String>();

        st.add("A");
        st.add("B");
        st.addLast("C");
        
        //stack
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("popped element is: " + s.pop());
        s.push(5);
        System.out.println("Peek: " + s.peek());
        
        
        

	}

}
 