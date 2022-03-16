package java_training_lab1;

/*
 * 21. Write a program using Switch–case to print number of days in
	a month. For the month of February check for leap year and
	calculate. 
 */

import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class Program_21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner stringObj=new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year=sc.nextInt();
		System.out.print("Enter the month : ");
		String month=stringObj.nextLine();
//		HashMap<String,Integer> map=new HashMap<>();
//		map.put("january", 31);
//		map.put("february", 28);
//		map.put("march", 31);
//		map.put("april", 30);
//		map.put("may", 31);
//		map.put("june", 30);
//		map.put("july", 31);
//		map.put("august", 31);
//		map.put("september", 30);
//		map.put("october", 31);
//		map.put("november", 30);
//		map.put("december", 31);
		
		
		int daysInMonthArray[]= {31,28,31,20,31,30,31,31,30,31,30,31};
		
		
		//checking leap year or not
		
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			daysInMonthArray[1]+=1;
		 }
		 month=month.toLowerCase();
		 switch(month) {
				 case "january":
					 System.out.println("Days in January month is "+daysInMonthArray[0]);
					 break;
		 
		 
				 case "february":
					 System.out.println("Days in February month is "+daysInMonthArray[1]);
					 break;
					 
				 case "march":
					 System.out.println("Days in March month is "+daysInMonthArray[2]);
					 break;
					 
				 case "april":
					 System.out.println("Days in April month is "+daysInMonthArray[3]);
					 break;
					 
				 case "may":
					 System.out.println("Days in May month is "+daysInMonthArray[4]);
					 break;
					 
				 case "june":
					 System.out.println("Days in June month is "+daysInMonthArray[5]);
					 break;
					 
					 
				 case "july":
					 System.out.println("Days in July month is "+daysInMonthArray[6]);
					 break;
					 
					 
				 case "august":
					 System.out.println("Days in August month is "+daysInMonthArray[7]);
					 break;
					 
					 
				 case "september":
					 System.out.println("Days in September month is "+daysInMonthArray[8]);
					 break;
					 
					 
				 case "october":
					 System.out.println("Days in October month is "+daysInMonthArray[9]);
					 break;
					 
					 
				 case "november":
					 System.out.println("Days in November month is "+daysInMonthArray[10]);
					 break;
					 
				 case "december":
					 System.out.println("Days in December month is "+daysInMonthArray[11]);
					 break;
					 
				default:
					System.out.println("Invalid month");
					break;
			 
		 }

	}

}
