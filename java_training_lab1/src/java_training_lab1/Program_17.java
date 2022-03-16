package java_training_lab1;



/*
 * 17. Write a program to test:
	a) to modify const member
	b) to access static member in a non -static method
	c) create a class with one argument constructor and try to instantiate
	object without parameter 
 */






public class Program_17 {
	static int value=2;
	int arg;
	
	public Program_17(int arg) {
		this.arg=arg;
		
	}

	public static void main(String[] args) {
//		a) to modify const member
		
		System.out.println(value);
		
		final int val=10;
//		val=12;
		
		
//		c) create a class with one argument constructor and try to instantiate
//		object without parameter 
		
		Program_17 obj=new Program_17();
		

	}
	
	
	public void print() {
		
//		b) to access static member in a non -static method
		System.out.println(value);
		
	}

}





