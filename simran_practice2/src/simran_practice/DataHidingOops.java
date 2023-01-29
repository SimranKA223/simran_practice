package simran_practice;

/*
 
 Data hiding is a way of restricting the access of our data members in class.
 
 We use access modifiers to achieve data hiding.
 
 here, we use getters and setters method.
 
 */

class AreaOfShapes{
	
	private int length;
	private int breadth;
	
	
	public void setLength(int length) {
		this.length=length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth=breadth;
	}
	
	public int getLength() {
	      return length;
	}
	
	public int getBreadth() {
	      return breadth;
	}
	
	public void printArea() {
		System.out.println(length*breadth); 
	}
	
}

public class DataHidingOops {
	
	public static void main(String[] args) {
		AreaOfShapes rectangle=new AreaOfShapes();
		rectangle.setLength(5);
		rectangle.setBreadth(5);
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getBreadth());
		rectangle.printArea();
	}
	

}
