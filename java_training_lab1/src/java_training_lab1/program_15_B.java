package java_training_lab1;


//import java.lang.*;
import java.util.*;
public class program_15_B {
	
	
	
	
	
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int num=sc.nextInt();
		if(isArmstrongNumber(num)) {
			System.out.println(num+" is armstrong number");
		}
		else if(isPerfectNumber(num)) {
			System.out.println(num+" is perfect number");
			
		}
		else if(isPalindromeNumber(num)) {
			System.out.println(num+" is palindrome number");
			
		}
		else {
			System.out.println("None of these");
		}
		
	}
public static boolean isArmstrongNumber(int num) {
	int temp=num,cubeSum=0;
	while(temp>0) {
		int rem=temp%10;
		temp/=10;
		cubeSum+=rem*rem*rem;
	}
	return cubeSum==num;
}

public static boolean isPerfectNumber(int num) {
	if(num<10)return true;
	int temp=num,numSum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			numSum+=i;
		}
	}
	return numSum==num;
	
}

public static boolean isPalindromeNumber(int num) {
	int numDuplicate=num;
	int reversedNumber=0;
	while(num>0) {
		int rem=num%10;
		reversedNumber=reversedNumber*10+rem;
		num/=10;
	}
	return numDuplicate==reversedNumber;
	
}


}
