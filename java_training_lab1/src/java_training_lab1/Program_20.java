package java_training_lab1;


public class Program_20 {

	public static void main(String[] args) {
		
		int array[][]= {
						{1,2,3,4},
						{5,18,7,8},
						{9,16,11,12}
						};
		int rowNumber=1;
		for(int rowArray[]:array) {
			int maxElement=rowArray[0];
			for(int val:rowArray) {
				if(val>maxElement) {
					maxElement=val;
				}
			}
			System.out.println("Max element in row "+rowNumber+" is : "+maxElement);
			rowNumber++;
		}

}
}
