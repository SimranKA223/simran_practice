package simran_practice;
import java.util.*;
public class FirstUniqueCharacterInString {
	
	static int ans(String a) {
		
		HashMap<Character, Integer> fmap = new HashMap<>();
		for(int i=0; i<a.length(); i++) {
			try {
				fmap.put(a.charAt(i), fmap.get(a.charAt(i))+1);
			}
			catch(Exception e){
				fmap.put(a.charAt(i), 1);
			}
			
			
			
		}
		for(int i=0; i<a.length(); i++) {
			if(fmap.get(a.charAt(i))==1) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		String a = "ababcbgrbm";
		System.out.println(ans(a)); 

	}

}
