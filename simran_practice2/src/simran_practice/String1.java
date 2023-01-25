package simran_practice;

//reverse a string

public class String1 {
	
	static void reverse(String str) {
		String nstr="";
		for(int i=str.length()-1; i>=0; i--) {
			nstr+=str.charAt(i);
		}
		
		System.out.println(nstr);
	}

	public static void main(String[] args) {
		String str="hello";
		reverse(str);
	}
}
