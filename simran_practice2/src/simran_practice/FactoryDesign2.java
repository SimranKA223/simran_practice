package simran_practice;

/*
 Factory design design defines an interface/ abstract class for creating an object
 but let subclass define which class to instantiate
 */

interface OnlineCourse{
	String getDetails();
}

class Java implements OnlineCourse{
	public String getDetails() {
		return "Java Course";
	}
}

class Python implements OnlineCourse{
	public String getDetails() {
		return "Python Course";
	}
}

class Cpp implements OnlineCourse{
	public String getDetails() {
		return "C++ Course";
	}
}

class CourseFactory{
	static OnlineCourse choseCourse(String course) {
		if(course.equalsIgnoreCase("Java")) {
			return new Java();
		}
		else if(course.equalsIgnoreCase("Python")) {
			return new Python();
		}
		else if(course.equals("Cpp")) {
			return new Cpp();
		}
		throw new IllegalArgumentException("Unknown channel "+course);
	}
	
}

public class FactoryDesign2 {

	public static void main(String[] args) {
		
		OnlineCourse o = CourseFactory.choseCourse("java");
		System.out.println(o.getDetails());

	}

}
