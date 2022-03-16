package java_training_lab1;

import java.util.Arrays;

public class program_15_A {

	public static void main(String[] args) {
		int primeNumberArray[]=new int[101];
		Arrays.fill(primeNumberArray, 1);
//		System.out.println(Arrays.toString(primeNumberArray));
		primeNumberArray[0]=0;
		primeNumberArray[1]=0;
		
		
		//Finding prime numbers using sieve of eratosthenes algorithm
		
		for(int currentVal=2;currentVal<100;currentVal++) {
			if(primeNumberArray[currentVal]==1) {
				int currentDivisor=currentVal*currentVal;
				while(currentDivisor<=100) {
					primeNumberArray[currentDivisor]=0;
					currentDivisor+=currentVal;
				}
			}
		}
		
		for(int ind=0;ind<101;ind++) {
			if(primeNumberArray[ind]==1) {
				System.out.print(ind+" ");
			}
		}

	}

}
