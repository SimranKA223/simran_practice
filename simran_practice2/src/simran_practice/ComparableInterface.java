package simran_practice;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	
	@Override
	public int compareTo(Emp o) {
		
		return this.id-o.id;
	}

	Emp(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class ComparableInterface {

	public static void main(String[] args) {
		
		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1,"Simran"));
		emps.add(new Emp(5,"Donna"));
		emps.add(new Emp(3,"Tina"));
		emps.add(new Emp(2,"Sanjana"));
		System.out.println(emps);
		Collections.sort(emps);
		System.out.println(emps);
		
	}

}
