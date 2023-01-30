package simran_practice;

//write a code to find the max profit you can make by selling and buying stocks
//in those given days (we can buy and sell only once)

public class ArrayStockQuestion {
	
	static int ans(int[] arr, int n) {
		int min=arr[0];
		int maxProfit=0;
		
		for(int i=0; i<n; i++) {
			min=Math.min(min, arr[i]);
			int profit=arr[i]-min;
			maxProfit=Math.max(profit, maxProfit);
		}
		
		
		return maxProfit;
	}

	public static void main(String[] args) {
		
		int[] arr= {100,180,260,310,40,535,695};
		int n=arr.length;
		int x=ans(arr,n);
		System.out.println(x);
	}

}
