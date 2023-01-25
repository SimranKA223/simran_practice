package simran_practice;

//spiral order of a 2-D matrix

/*
 1  5  7  9  10 11
 6  10 12 13 20 21
 9  25 29 30 32 41
 5  55 59 63 68 70
 40 70 79 81 95 105
 
 o/p:- 1,5,7,9,10,11,21,41,70,105,95,81,79,70,40,15,9,6,10,12,13,20,32,68,63,59,55,25,29,30,29
 */

public class Array8 {
	
	public static void main(String[] args) {
		
		int[][] matrix= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		int rowstart=0;
		int rowend=matrix.length-1;
		int colstart=0;
		int colend=matrix[0].length-1;
		
		while(rowstart<=rowend && colstart<=colend) {
			for(int col=colstart; col<=colend; col++) {
				System.out.println(matrix[rowstart][col]);
			}
			rowstart++;
			for(int row=rowstart; row<=rowend; row++) {
				System.out.println(matrix[row][colend]);
			}
			colend--;
			if(rowstart<=rowend) {
				for(int col=colend; col>=colstart; col--) {
					System.out.println(matrix[rowend][col]);
				}
			}
			
			rowend--;
			if(colstart<=colend) {
				for(int row=rowend; row>=rowstart; row--) {
					System.out.println(matrix[row][colstart]);
				}
			}
			
			colstart++;
		}
		
		
	}

}
