package simran_practice;

/*
 
 singleton class: a class which allows us to create only one object.
 
 Achieved by:
 1)private constructor.
 2)create a static object inside a class.
 3)getInstance function:-It is a static method. Static method can only access static members i.e the object.
   can be accessed outside the class without creating objects.
 
 */


class Students{
	
	static Students st = new Students();
	
	private Students() {
		System.out.println("This constuctor will be involved only once");
	}
	
	static Students getInstance() {
		return st;
	}
	
}

public class SingletonClass {

	public static void main(String[] args) {
		
		//Student s2=new Student(); Error:Constructor student is not visible
		//I cannot use new Keyword.
		Students st1=Students.getInstance();

	}

}
