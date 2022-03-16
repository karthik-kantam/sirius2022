package java_training_lab1;

import java.util.Arrays;

//9. Write a program to reverse elements in the Array 

public class program_9 {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,4,6,7,8,9,11,3,6};
		
		System.out.println("Array before reversing : "+Arrays.toString(arr));
		
		int leftInd=0;
		int rightInd=arr.length-1;
		while(leftInd<rightInd) {
			int temp=arr[leftInd];
			arr[leftInd]=arr[rightInd];
			arr[rightInd]=temp;
			leftInd++;
			rightInd--;
			
		}
		System.out.println("Array after reversing : "+Arrays.toString(arr));
		
		
		
	}
}
