package java_training_lab1;


/*
 * 16. Write a program to search a given element is present or not? If
present, display the location and how many times it occurs.
 */

public class program_16 {
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,1,2,1,2,1};
		int searchElement=7;
		int count=0,occuredFlag=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==searchElement) {
				System.out.println(searchElement+" occured on index "+index);
				count++;
				occuredFlag=1;
			}
		}
		if(occuredFlag==1) {
			System.out.println(searchElement+" occured "+count+" times");
		}
		else {
			System.out.println(searchElement+" not present in the given array");
		}
		
	}

}
