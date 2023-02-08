package simran_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Grapes");
		list.add("Pineapple");
		list.add("Kiwi");
		
		System.out.println(list);
		
		//for loop
		/*
		for(String fruit:list) {
			if(fruit.equals("Kiwi")) {
				list.remove(fruit); - shows current modification error
			}
		}
		*/
		
		//facing and concurrent Modification Exception
		
		//using iterator
		Iterator<String> it = list.iterator();  
        while (it.hasNext()) {                   
        	String value = it.next();              
            System.out.println("List Value:" + value);  
            if (value.equals("Mango")) {  
                //list.remove(value);  - Concurrent Modification Exception
            	it.remove();
            }	
        }  
        
        System.out.println(list);
        
        //remove all method  
        ArrayList<String> helper = new ArrayList<>();
        for(String fruit : list) {
        	if(fruit.equals("Grapes")) {
        		helper.add(fruit);
        	}
        }
        
        list.removeAll(helper);
        
        System.out.println(list);
		
	}

}
