package simran_practice;
import java.util.*;
//Pair sum-Given an array and a number , check for the sum with pair as x.

public class Array6 {
	
	static void pair(int[] arr, int x) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int rsum=x-arr[i];
			if(map.containsKey(rsum)) {
				System.out.println(map.get(rsum) +" "+ i);
			}
			map.put(arr[i],i);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {0,-1,2,-5,1}; //-3 and 1
		int x=2;
		pair(arr,x);
	}

}
