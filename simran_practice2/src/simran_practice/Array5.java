package simran_practice;

//cyclically rotate an array

public class Array5 {
	
	static void rotate(int[] arr) {
		int n=arr.length;
		
		
			int temp=arr[0];
			arr[0]=arr[n-1];
			arr[n-1]=temp;
			
		
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		rotate(arr);
	}

}
