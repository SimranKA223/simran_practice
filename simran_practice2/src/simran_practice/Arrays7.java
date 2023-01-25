package simran_practice;


//Maximum sum subarray problem AKA kadane's algorithm

public class Arrays7 {
	
	static int maxSum(int[] arr) {
		int csum=arr[0];
		int osum=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(csum>0) {
				csum+=arr[i];
			}
			else {
				csum=arr[i];
			}
			if(csum>osum) {
				osum=csum;
			}
		}
		return osum;
		
	}

	public static void main(String[] args) {
		int[] arr= {2,-3,1,2,3};
		System.out.println(maxSum(arr));

	}

}
