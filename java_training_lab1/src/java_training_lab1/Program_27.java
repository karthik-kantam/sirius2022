package java_training_lab1;


//27. Create a program that calculates how much a $14,000
//investment would be worth if it increased in value by 40% during the
//first year, lost $1,500 in value the second year, and increased 12% in
//the third year. 

public class Program_27 {
	static int investment=14000;
	public void gain(int percentage) {
		this.investment+=investment*(percentage/100);
		
		
	}
	public void loss(int amount) {
		this.investment-=amount;
		
	}

	public static void main(String[] args) {
		
		
		Program_27 obj=new Program_27();
		obj.gain(40);
		obj.loss(1500);
		obj.gain(12);
		System.out.println("After 3 years investment worth "+investment);
		
		
		
		

	}

}
