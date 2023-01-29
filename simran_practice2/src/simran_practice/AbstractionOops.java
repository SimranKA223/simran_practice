package simran_practice;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	double area() {
		return Math.PI*radius*radius;
	}
	
}

class Rectangle extends Shape{
	double length;
	double width;
	
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	
	double area() {
		return length*width;
	}
	
}



public class AbstractionOops {

	public static void main(String[] args) {
		
		Shape c=new Circle(2.5);
		System.out.println(c.area());
		
		Shape r=new Rectangle(4,5);
		System.out.println(r.area());

	}

}
