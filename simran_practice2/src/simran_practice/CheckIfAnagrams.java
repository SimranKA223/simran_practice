package simran_practice;

import java.util.Arrays;

public class CheckIfAnagrams {
	
	static boolean check(String a , String b) {
		if(a.length()==b.length()) {
			
			//lower case
			a=a.toLowerCase();
			b=b.toLowerCase();
			
			//convert string to array for sorting
			char[] A=a.toCharArray();
			char[] B=b.toCharArray();
			
			//sort
			Arrays.sort(A);
			Arrays.sort(B);
			
			//compare
			if(Arrays.equals(A, B)) {
				return true;
			}else {
				return false;
			}
			
			
			
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		String a="Fried";
		String b="Fired";
		System.out.println(check(a,b));
	}

}
