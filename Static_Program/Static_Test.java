package Static_Program;


abstract class Test2{
	//abstract public static void display1();  this is not allowed.
	
}

class Test1{
	static void  display() {
		System.out.println("This is static method");
	}
}
public class Static_Test extends Test1{
		static int i = 2;
		
		
		public static void main(String args[]) {
			Static_Test.i=5;
			System.out.println(i);
			Test1.display();
		}
}
