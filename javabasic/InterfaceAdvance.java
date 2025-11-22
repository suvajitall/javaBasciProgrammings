package javabasic;

interface inter_face{
	public void display();
	
	/*public void runs() {
		System.out.println("this is run method");
	}*/ /* ==================================== >> This will give error, because interface contains public abstract method
	, default method with body and static method with body */
	
	static void run() {
		System.out.println(" This is static Run method from inter_face");
	}
	
	default void default_method() {
		System.out.println("default method from interface");
	}
}

class Test implements inter_face{
	public void display(){
		System.out.println("This is display method from test class");
	}
}
public class InterfaceAdvance implements inter_face{
	public void display(){
		System.out.println("This is display method from InterfaceAdvance class");
	}
	public static void main(String args[]) {
		// 1st approach 

		InterfaceAdvance objs = new InterfaceAdvance();
		objs.display();
		
		
		//2nd approach
		
		inter_face obj = new InterfaceAdvance();
		obj.display();
		
		//3rd approach
		inter_face obj1  = new Test();
		obj1.display();
		
		//4th approach (if the method is declare inside the interface and it's a static method)
		inter_face.run();
		
		// 5th approach (if the method is defined inside interface and it's default method)
		InterfaceAdvance obj2 = new InterfaceAdvance();
		obj2.default_method();
		
	}
}




