package simran_practice;

//Missing element in an array

public class Array4 {
	
	static int missing(int[] arr){
		int count=1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=count) {
				return count;
			}
			else {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		System.out.println(missing(arr));
	}

}
