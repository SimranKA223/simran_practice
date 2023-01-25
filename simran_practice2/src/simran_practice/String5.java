package simran_practice;

//vowels and consonants


public class String5 {
	
	static void count(String str) {
		
		int vowels=0; 
		int consonants=0;
		
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }
		
		System.out.println("Vowels : " + vowels + "  consonants : " + consonants);
	}
	
	
	public static void main(String[] args) {
		String str="hello world!;";
		count(str);
	}

}
