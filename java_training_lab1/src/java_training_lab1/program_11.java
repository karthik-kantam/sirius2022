package java_training_lab1;

/*
 * 11.Write a program to display number matrix as follows using Two Dimensional
	Rectangular Array.
 	1
 	2 3
 	4 5 6
 	7 8 9 10 
 */

public class program_11 {
	public static void main(String[] args) {
		
		
		int array[][]= {{1},{2,3},{4,5,6},{7,8,9,10}};
		int rowLen=array.length;
		for(int rowInd=0;rowInd<rowLen;rowInd++) {
			for(int colInd=0;colInd<array[rowInd].length;colInd++) {
				
				System.out.print(array[rowInd][colInd]+" ");
				
			}
			System.out.println();
		}
		
	}

}
