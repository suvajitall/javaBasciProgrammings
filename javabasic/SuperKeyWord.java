package javabasic;

class TestSUperKeyword{
	String str = "Parent class variable";
	public void display() {
		System.out.println("This is from TestSuperKeyword");
	}
	
	TestSUperKeyword() {
		System.out.println(" >>> Super class constructor");
	}
}
public class SuperKeyWord extends TestSUperKeyword{
	
	SuperKeyWord(){
		super();
	} 
	
	String str = "Child class variable";
	public void display() {
		System.out.println("This is from SuperKeyword");
		super.display();
		System.out.println(super.str + " : "+ this.str);
	}
	

	public static void main(String args[]) {
	SuperKeyWord obj = new SuperKeyWord();
	obj.display();
	
	}
}
