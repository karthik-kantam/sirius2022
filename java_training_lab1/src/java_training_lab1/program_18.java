package java_training_lab1;


//18. write a program to convert number into words
//Example: 125 as one two five (or one hundred twenty five) 

public class program_18 {

	public static void main(String[] args) {
		
		String wordArray[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int num=125;
		int reversedNumber=reversedNum(num);
		while(reversedNumber>0) {
			int rem=reversedNumber%10;
			System.out.print(wordArray[rem]+" ");
			reversedNumber/=10;
		}
		
		

	}
	public static int reversedNum(int num) {
		int reversedNum=0;
		while(num>0) {
			int rem=num%10;
			num/=10;
			reversedNum=reversedNum*10+rem;
		}
		return reversedNum;
	}

}
