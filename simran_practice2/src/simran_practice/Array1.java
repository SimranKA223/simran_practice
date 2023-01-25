package simran_practice;

//Given an array arr[] of integers.
//Find a peak element i.e. an element that is not smaller than its neighbors. 
public class Array1 {
	
	static void peak(int[] arr) {
		int n=arr.length;
		if(n==1) {
			System.out.println(arr[n] + " at index " + "0");
		}
		int x=n-1;
		if(arr[n-1]>=arr[n-2]) {
			System.out.println(arr[n-1] + " at index " +  x);
		}
		for(int i=1; i<n-1; i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				System.out.println(arr[i] + " at index " + i);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 20, 4, 1, 0 };
		peak(arr);
		
	}

}
