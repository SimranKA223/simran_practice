package simran_practice;

//write a code to find the max profit you can make by selling and buying stocks
//in those given days (we can buy and sell only once)


public class ArrayStockQuestion2 {
	
	static int ans(int[] arr, int n) {
		int profit=0;
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		
		int[]arr = {100,180,260,310,40,535,695};
		int n=arr.length;
		System.out.println(ans(arr,n));

	}

}
