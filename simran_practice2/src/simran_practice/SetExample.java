package simran_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		/*set interface :-restricts the insertion of duplicate elements.
		 */
		
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(2);
		
		System.out.println(set1.contains(2));
		
		System.out.println(set1);
		
		Set<Integer> set2 = new HashSet<>();
		
		set2.add(2);
		set2.add(4);
		set2.add(5);
			
		System.out.println(set1.contains(2));
		
		System.out.println(set1);
		
		/*
		 UNION
		 [1,2,3] [2,4,5] -> [1,2,3,4,5]
		 
		 */
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union of set1 and Set2: "+union);
		
		/*
		 INTERSECTION
		 [2]
		 */
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection of set1 and set2: " +intersection);
		
		/*
		 DIFFERENCE
		 Set1-Set2 :-remove all elements of Set2 from Set1
		 [1,3]
		 */
		Set<Integer> diff = new HashSet<>(set1);
		diff.removeAll(set2);
		System.out.println("Set1 - Set2: " + diff);
		
		set1.clear();
		System.out.println("clear method: " + set1);
		
		//Removing
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		System.out.println("HashSet: " + set);//not ordered
		set.remove("two");
		System.out.println(set); 
		
		
		Set<String> sett = new TreeSet<>();
		sett.add("one");
		sett.add("two");
		sett.add("three");
		sett.add("four");
		System.out.println("TreeSet: " + sett);
		sett.remove("two");
		System.out.println(sett);//Ordered lexicographically
		
		//Iterator
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//LinkedHashSet:-iterates through the elements in the order in which they were inserted.
		Set<String> settt = new LinkedHashSet<>();
		settt.add("one");
		settt.add("two");
		settt.add("three");
		settt.add("four");
		System.out.println("Linked HashSet: " + settt);
		
		//treeset in descending order
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(40);
	    treeSet.add(15);
	    treeSet.add(90);
	    treeSet.add(70);
	    treeSet.add(55);
	    System.out.println("TreeSet: " + treeSet);
	    TreeSet<Integer> res = (TreeSet<Integer>) ((TreeSet<Integer>) treeSet).descendingSet();
	    System.out.println("TreeSet after sorting in descending order: " + res);
	    
	    
	    
	    //clone method in HashSet
	    Carr carr1 = new Carr(1, "Ferrari");
        Carr carr2 = new Carr(2, "BMW");
        Carr carr3 = new Carr(3, "Volvo");
        
	    HashSet<Carr> s = new HashSet<>();
	    
	    s.add(carr1);
        s.add(carr2);
        s.add(carr3);
        // Use add() method to add elements into the Set
        
        System.out.println("HashSet: " + s);
  
        HashSet cloned_set = new HashSet();
        cloned_set=(HashSet)s.clone();
  
        System.out.println("The new set: " + cloned_set);
        carr3.name = "Tesla";
        System.out.println(cloned_set); //shallow 
        System.out.println(s);
        
    
	}

}

class Carr {
    int id;
    String name;
    public Carr(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    @Override
    public String toString() {
        return id + "-" + name;
    }
}
 