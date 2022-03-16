package java_training_lab1;

public class Program_22_private {
	private class privateExample{
		int val=11;
		private int get() {
			return this.val;
		}
	}
	privateExample privateObj=new privateExample();
	public int get() {
		return privateObj.get();
	}

}
