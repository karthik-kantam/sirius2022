package java_training_lab1;

import java.util.ArrayList;
import java.util.Arrays;

//6. Write a program to resize an array. – cant resize an array

public class program_6 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=i;
		}
		int copyArray[]=new int[10];
		System.arraycopy(arr, 0, copyArray, 0, arr.length);
		System.out.println(Arrays.toString(copyArray));
		
	}

}
