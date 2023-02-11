package simran_practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		
		//sorted set is an interface 
		//Tree set is a class
		
		SortedSet<Integer> set=new TreeSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(5);
		
		System.out.println("Sorted set: "+  set);
		System.out.println("first: " + set.first()); //returns first element
		System.out.println("last: "+set.last());
		System.out.println("headset: " +set.headSet(3));//returns all the elements before the specified element
		System.out.println("tailset: " +set.tailSet(3));//returns all the elements after the specified element
		System.out.println("Subset: " +set.subSet(2,4));//returns all the elements before the specified element
		System.out.println("Contains: " + set.contains(2));
		System.out.println(set.remove(4)); //returns true
		
		
		SortedSet<String> setStrings = new TreeSet<>(new ZtoAComparator());
		 
		setStrings.add("Banana");
		setStrings.add("Apple");
		setStrings.add("Grape");
		setStrings.add("Lemon");
		setStrings.add("Watermelon");
		 
		System.out.println(setStrings);
		
		
			
	}

}

class ZtoAComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
