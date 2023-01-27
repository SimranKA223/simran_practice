package simran_practice;


public class ImmutableStrings {

	public static void main(String[] args) {
		
		//the value of string will not get changed because the strings are immutable
		String s1="Hello";
		s1.concat(" Simran");
		System.out.println("s1: " + s1);
		
		//String objects are immutable in memory, String variables can point to any string we want
		String str="Hello";
		str="hi";
		System.out.println("new string: " + str);
		
		/*if two strings have same string object 
		 eg:
		 String a="hi";
		 String b="hi";
		 both a and b will point to same string object in memory.
		 thus, saving space.
		 but if we create a string c="hi" using new keyword then
		 it will create new string object in memory.
		*/
		String name="Donna";
		String secondName="Donna";
		String thirdName=new String("Donna");
		System.out.println(name==secondName); //true
		System.out.println(name==thirdName);  //false
		
		//mutable string : using string buffer
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Simran");
		System.out.println("s2: " + sb);
		
		//mutable string: using string builder
		
		StringBuilder s = new StringBuilder("Hello ");
		s.append("Simran");
		System.out.println("s3: " + s);

	}

}
