package simran_practice;

//Write a Java program to fill in a letter template

public class String3 {
	
	public static void main(String[] args) {
		String letter = "Dear <|name|>, hello!";
        letter = letter.replace("<|name|>", "Simran");
        System.out.println(letter);
	}

}
