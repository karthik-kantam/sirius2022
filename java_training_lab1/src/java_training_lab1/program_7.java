package java_training_lab1;

import java.util.Arrays;

public class program_7 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,3,4,2,6,5};
		int arrLen=arr.length;
		//Sorting : Ascending order
		for(int i=0;i<arrLen-1;i++) {
			for(int j=i+1;j<arrLen;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array sorting ascending order : "+Arrays.toString(arr));
		
		
		
		//Sorting : Descending order
		
		for(int i=0;i<arrLen-1;i++) {
			for(int j=i+1;j<arrLen;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array sorting descending order : "+Arrays.toString(arr));
	}
}
