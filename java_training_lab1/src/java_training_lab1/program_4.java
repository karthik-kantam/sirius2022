package java_training_lab1;

import java.util.*;

public class program_4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		
//		System.out.println(reversedNumber);
		if(isPrime(num)) {
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		if(num==2) {
			return true;
		}
		for(int i=2;i<=Math.pow(num, 0.5);i++) {
			if(num%2==0) {
				return false;
			}
			
		}
		return true;

}
}
