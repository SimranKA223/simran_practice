package simran_practice;
import java.lang.Cloneable;

class Studentss implements Cloneable{
	int id;
	String name;
	Studentss(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	 
	protected Object clone()
	throws CloneNotSupportedException{
		return super.clone();
	}
}

public class InterfaceClonable {
	
	public static void main(String[] args)  throws CloneNotSupportedException{
		Studentss a = new Studentss(1,"Simran");
		Studentss b = (Studentss)a.clone();
		
		System.out.println("id: " + b.id + " Name: " + b.name);
	}
	
	
	

}
