package java_training_lab1;

/*
 * 
 * 10.Write a program to display number matrix as follows using Two Dimensional
	Rectangular Array.
 			1 2 3 4
 			5 6 7 8
 			9 10 11 12
 			13 14 15 16 
 * 
 */

public class program_10 {
	public static void main(String[] args) {
		int twoDimensionalArray[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int rowLen=twoDimensionalArray.length;
		int colLen=twoDimensionalArray[0].length;
		
		for(int rowInd=0;rowInd<rowLen;rowInd++) {
			for(int colInd=0;colInd<colLen;colInd++) {
				System.out.print(twoDimensionalArray[rowInd][colInd]+" ");
			}
			System.out.println();
		}
	}

}
