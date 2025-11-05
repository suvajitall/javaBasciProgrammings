package javabasic;
class BaseClass{
	public void display() {
		System.out.println("parent class");
	}
}

class ChildClass extends BaseClass{
	public void display() {
		System.out.println("Child class");
		//BaseClass obj = new BaseClass();
		//obj.display();
	}
}

public class Inheritances{
	public static void main(String args[]) {
		BaseClass obj = new ChildClass();
		obj.display();
	}
}
