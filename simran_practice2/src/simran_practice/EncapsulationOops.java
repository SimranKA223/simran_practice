package simran_practice;

/*
 In the above example, we have created a class named Area. The main purpose of this class is to calculate the area.
 
To calculate an area, we need two variables: length and breadth and a method: getArea().
 
Hence, we bundled these fields and methods inside a single class.

Here, the fields and methods can be accessed from other classes as well. Hence, this is not data hiding.

This is only encapsulation. We are just keeping similar codes together.
 */

class Area {

	  int length;
	  int breadth;

	  Area(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }

	  void getArea() {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }
	}

public class EncapsulationOops {

	public static void main(String[] args) {
		
		Area rectangle = new Area(7, 6);
	    rectangle.getArea();
		
	}

}
