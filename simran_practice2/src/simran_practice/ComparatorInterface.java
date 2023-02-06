package simran_practice;

import java.util.*;

class Doggy implements Comparator<Doggy>, Comparable<Doggy> {
	   private String name;
	   private int age;
	   Doggy() {
	   }

	   Doggy(String n, int a) {
	      name = n;
	      age = a;
	   }

	   public String getDogName() {
	      return name;
	   }

	   public int getDogAge() {
	      return age;
	   }

	   
	   public int compareTo(Doggy d) {
	      return (this.name).compareTo(d.name);
	   }

	    
	   public int compare(Doggy d, Doggy d1) {
	      return d.age - d1.age;
	   }
	}

	public class ComparatorInterface {

	   public static void main(String args[]) {
	      
	      ArrayList<Doggy> list = new ArrayList<Doggy>();

	      list.add(new Doggy("Villi", 3));
	      list.add(new Doggy("Tuffy", 2));
	      list.add(new Doggy("Jerry", 10));
	      list.add(new Doggy("Tom", 4));
	      list.add(new Doggy("Jordan", 1));
	      Collections.sort(list);  

	      for(Doggy a: list)   
	         System.out.print(a.getDogName() + ", ");

	      
	      Collections.sort(list, new Doggy());
	      System.out.println(" ");
	      
	      for(Doggy a: list)   
	         System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
	   }
	}
