package java_training_lab1;

/*
 * 
 * 
3. Write a program to declare all primitive data types with all possible types of
initialization and also check implicit and explicit type casting by assigning
them to each other.

 
 
*/
public class program_3 {
	public static void main(String[] args) {
		
		
		
		byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        long l=1000000000000000000l;
        boolean bool=true;
        
        
        
        //implicit type casting
        
        long implicit_type_casting=i;
        System.out.println(implicit_type_casting);
        
        
        
        //explicit type casting
        
        int explicit_type_casting=(int)f;
        System.out.println(explicit_type_casting);
	}

}
