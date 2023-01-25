package simran_practice;

public class Array3 {
	
	//Given a sorted array arr[] and a number x, write a function
	//that counts the occurrences of x in arr[].
	
	
	static int count(int[] arr, int x) {
		int ans=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				ans++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 8;
        System.out.println(count(arr,x));
	}

}
