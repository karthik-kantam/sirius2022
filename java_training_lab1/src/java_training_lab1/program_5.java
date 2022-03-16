package java_training_lab1;

public class program_5 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(calculateAverage(arr));
	}
	public static double calculateAverage(int[] arr) {
		int arrSum=0;
		for(int val : arr) {
			arrSum+=val;
		}
		return arrSum/arr.length;
	}

}
