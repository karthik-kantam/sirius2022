package java_training_lab1;


/*
 * 13.Write a Program to calculate result of students.(take no of student as
	rows and marks as columns of two Dimensional Array) 
 */

import java.util.*;
public class program_13 {
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the students count: ");
//		int numberofStudents=sc.nextInt();
//		System.out.print("Enter the subjects count: ");
//		int numberofSubjects=sc.nextInt();
//		int studentDatabase[][]=new int[numberofStudents][numberofSubjects];
//		for(int studentInd=0;studentInd<numberofStudents;studentInd++) {
//			for(int subjectInd=0;subjectInd<numberofSubjects;subjectInd++) {
//				studentDatabase[studentInd][subjectInd]=sc.nextInt();
//			}
//		}
//		
		
		
		int studentDatabase[][]= {{80,45,35},{36,89,40},{67,89,60}};
		int numberofStudents=studentDatabase.length;
		int numberofSubjects=studentDatabase[0].length;
		
		
		//Calculating result of students
		
		
		for(int studentInd=0;studentInd<numberofStudents;studentInd++) {
			int studentMark=0;
			for(int subjectInd=0;subjectInd<numberofSubjects;subjectInd++) {
				studentMark+=studentDatabase[studentInd][subjectInd];
			}
			System.out.println("Student "+(studentInd+1)+" result : "+studentMark);
		}
		
	}

}
