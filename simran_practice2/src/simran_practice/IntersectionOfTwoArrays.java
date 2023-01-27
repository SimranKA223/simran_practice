package simran_practice;

import java.util.*;

public class IntersectionOfTwoArrays {
	
	static int[] intersection(int[] a, int[] b) {
		
		HashSet<Integer> set= new HashSet<>();
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		HashSet<Integer> result=new HashSet<>();
		for(int i=0; i<b.length; i++) {
			if(set.contains(b[i])) {
				result.add(b[i]);
			}
		}
		//convert hashmap into array
		int[] ans=new int[result.size()];
		int idx=0;
		for(int n:result) {
			ans[idx]=n;
			idx++;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6};
		int[] b= {2,3,5};
		
		int[] arr = intersection(a,b);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
