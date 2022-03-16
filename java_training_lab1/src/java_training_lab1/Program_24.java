package java_training_lab1;


/*
 * 24. Write a simple Java class for quadratic functions of the form
f(x) = ax2
 + bx + c.
It contain the following elements:
 fields for values a, b, and c,
 A(int a,int b,intc)
 new Abc(2,3,4)
 a constructor with no parameters (setting a, b, and c to 1),
 a constructor with 3 parameters, to specify a, b, and c,
 three extractors that return the values of a, b, and c, respectively,
 a modifier that requires three parameters, one each to give new
values to a, b, and c,
 a compute method that takes a parameter x and that returns the
value f(x) for the given values of a, b, and c, and a main method
that exercises each of the methods. 
 */

public class Program_24 {
	
	
	int a,b,c;
	
	public Program_24() {
		this.a=1;
		this.b=1;
		this.c=1;
	}
	
	
	public Program_24(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
	public int getA() {
		return this.a;
	}
	public int getB() {
		return this.b;
	}
	public int getC() {
		return this.c;
	}
	
	
	public int compute(int x) {
		
		return this.a*x*x+this.b*x+this.c;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program_24 obj=new Program_24();
		System.out.println(obj.a+" "+obj.b+" "+obj.c);
		
		
		Program_24 obj1=new Program_24(1,2,3);
		System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);
		
		System.out.println(obj1.compute(2));
		

	}

}
