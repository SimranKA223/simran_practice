package simran_practice;


public class StringMethods {
	
	public static void main(String[] args) {
		
		//returns character at index 1.
		String str="My name is Simran";
		String str2="My name is Simran";
		String str3= new String("My name is Simran");
		System.out.println(str.charAt(1));
		
		//returns unicode value of m at index 0.
		System.out.println(str.codePointAt(0));
		
		//returns unicode value of y at index 1.
		System.out.println(str.codePointBefore(2));
		
		//returns the number of Unicode values found in a string
		System.out.println(str.codePointCount(0, 5));
		
		//returns o/true because the strings are same
		System.out.println(str.compareTo(str2));
		//only checks the value
		System.out.println(str.compareTo(str3));
		
		//concat: joining
		String firstName = "Simran ";
		String lastName = "Attri";
		System.out.println(firstName.concat(lastName));
		
		//contains : returns boolean value.
		System.out.println(str.contains("my"));
		
		//ends with
		System.out.println(str.endsWith("an"));
		
		//value check
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		
		//hashcode
		System.out.println(str.hashCode());
		
		//index of
		System.out.println(str.indexOf("Simran"));
		
		//Search a string for the last occurrence of Simran
		System.out.println(str.lastIndexOf("Simran"));
		
		//empty
		System.out.println(str.isEmpty());
		
		//length
		System.out.println(str.length());
		
		//replace
		System.out.println(str.replace('n','e'));
		
		//trim: Remove whitespace from both sides of a string
		String str4="    Hello   ";
		System.out.println(str4.trim());
		
		//subsequence
		System.out.println(str.subSequence(11, 17));
		
		
	}

}
