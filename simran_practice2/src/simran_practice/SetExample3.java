package simran_practice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetExample3 {

	public static void main(String[] args) {
		NavigableSet<Integer> n = new TreeSet<>();
        n.add(7);
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);
 
        // Get a reverse view of the navigable set
        NavigableSet<Integer> rev = n.descendingSet();
 
        // Print the normal and reverse views
        System.out.println("Normal order: " + n);
        System.out.println("Reverse order: " + rev);
        
        System.out.println("pollFirst: " + n.pollFirst()); //removes first element
        System.out.println("N Set:  " + n);
 
        System.out.println("pollLast: " + n.pollLast()); //removes last element
        System.out.println("N Set:  " + n);
        
        System.out.println(n.contains(10));
        
        System.out.println("First Value " + n.first());
        System.out.println("Last Value " + n.last());
        
        //iteration
        for (Integer value : n)
            System.out.print(value + ", ");
        System.out.println();
        
        System.out.println("lower: " + n.lower(3));
        System.out.println("floor: " + n.floor(3));//Returns greatest element in  set less than or equal to the given element
        System.out.println("higher: " + n.higher(3));
        System.out.println("ceiling: " + n.ceiling(3)); //Returns least element in set greater than or equal to the given element
        
        
	}

}
