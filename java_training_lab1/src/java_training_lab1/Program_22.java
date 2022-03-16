package java_training_lab1;

public class Program_22 {
	
	public class publicExample{
		
		int a;
		public publicExample(int a) {
			this.a=a;
			
		}
		
	}

	public static void main(String[] args) {
		Program_22_public publicObj=new Program_22_public();
		System.out.println(publicObj.val);
		System.out.println(publicObj.get());
		
		
		Program_22_private privateObj=new Program_22_private();
		System.out.println(privateObj.get());
		
		Program_22_protected protectedObj=new Program_22_protected();
		System.out.println(protectedObj.val);
		
		
		Program_22_default defaultObj = new Program_22_default();
		System.out.println(defaultObj.a);
		

	}

}
