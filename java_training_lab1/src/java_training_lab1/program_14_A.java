package java_training_lab1;

/*
 * Demo program for javadoc
 */



/*
 * @author Karthik K
 */
public class program_14_A {
		
	
	/*
	 * @param args command line arguments
	 */

	public static void main(String[] args) {
		
		int a=10;
		int b=13;
		System.out.println(add(a,b));
		

	}
	
	public static int add(int a,int b) {
		
		/*
		 * Calculating addition of a and b
		 * 
		 * @param a value1
		 * 
		 * @param b value2
		 * 
		 * @return integer value addition of a and b
		 */
		return a+b;
	}

}
