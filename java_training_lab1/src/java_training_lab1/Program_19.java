package java_training_lab1;


//19. Write a program to reverse the elements of each row in a two
//dimensional array 

public class Program_19 {

	public static void main(String[] args) {
		
		int array[][]= {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
						};
		for(int rowInd=0;rowInd<array.length;rowInd++) {
			int leftInd=0,rightInd=array[rowInd].length-1;
			while(leftInd<rightInd) {
				int temp=array[rowInd][leftInd];
				array[rowInd][leftInd]=array[rowInd][rightInd];
				array[rowInd][rightInd]=temp;
				leftInd++;
				rightInd--;
			}
		}
		
		System.out.println("Array after reversing each row");
		for(int rowArray[]:array) {
			for(int ele : rowArray) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
	}

}
