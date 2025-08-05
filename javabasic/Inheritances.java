package javabasic;
class BaseClass{
	public void sum(int i, int j) {
		int sum = i+j;
		System.out.print("total sum is : "+sum);
	}
	
	public void sum(int i, int j, int k) {
		int sum = i+j+k;
		System.out.print("total sum is : "+sum);
	}
}

class ChildClass extends BaseClass{
	public void sum(int i, int j) {
		int sum = i+j+1;
		System.out.print("total sum is : "+sum);
	}
	
	public void sum(float i, float j) {
		float sum = i+j;
		System.out.print("total sum is : "+sum);
	}
}
public class Inheritances extends ChildClass{
		public static void main(String args[]) {
			BaseClass obj1 = new ChildClass();
			ChildClass obj2 = new Inheritances();
			obj2.sum(5, 5);
			
		}
}
