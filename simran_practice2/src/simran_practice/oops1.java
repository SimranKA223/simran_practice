package simran_practice;

class Student{
	
	String name;
	int age;
	
	//non parameterized constructor
	Student(){
		System.out.println("Constructor called");
	}
	
	//parameterized constructor
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	Student(Student s){
		this.name=s.name;
		this.age=s.age;
	}
	
	public void printinfo() {
		System.out.println("Name: " + this.name + " Age: " + this.age);
	}
	
}

public class oops1 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Donna",22);
		s2.printinfo();
		Student s3 = new Student("Tina", 27);
		s3.printinfo();
		Student s4 = new Student(s2);
		s4.printinfo();
	}

}
