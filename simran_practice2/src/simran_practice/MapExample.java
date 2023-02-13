package simran_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		//Map is an Interface,,,,,, HashMap, TreeMap, LinkedHashMap are classes. 
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Simran");
		map.put(2, "Donna");
		map.put(3, "Vishali");
		map.put(4, "Aman");
		System.out.println("HashMap: " + map);
		
		//adding duplicate :- Key cannot be same but values can be same.
		map.put(4, "Ankita");
		System.out.println(map);
		map.put(5, "Donna");
		System.out.println(map);
		
		
		//Changing/updating element
		map.put(5, "Dorothy");
		
		//removing element
		map.remove(3); //(Key)
		
		//Iteration
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "  -  " + m.getValue());
		}
		
		//TreeMap:-Ascending Order:- Orders according to key.
		Map<Integer,String> map1 = new TreeMap<>();
		map1.put(2, "Simran");
		map1.put(1, "Donna");
		map1.put(5, "Vishali");
		map1.put(3, "Aman");
		System.out.println("TreeMap: " + map1);
		
		//LinkedHashMap:-maintains the insertion order :-not synchronized
		Map<Integer,String> map2 = new LinkedHashMap<>();
		map2.put(2, "Simran");
		map2.put(1, "Donna");
		map2.put(5, "Vishali");
		map2.put(3, "Aman");
		System.out.println("LinkedHashMap: " + map2);

	}

}
