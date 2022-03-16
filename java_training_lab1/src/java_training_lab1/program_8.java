package java_training_lab1;

//8. Write a program to find the location of element in the Array. 

public class program_8 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		int searchElement=3;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchElement) {
				System.out.println("Search element location(index) : "+i);
			}
		}
				
	}

}
