package javabasic;

class TestSUperKeyword{
	String str = "Parent class variable";
	public void display() {
		System.out.println("Display function from TestSuperKeyword");
	}
	
	TestSUperKeyword() {
		System.out.println(" >>> Non Parameterize constructor of TestSUperKeyword class");
	}
	TestSUperKeyword(String str) {
		//this();
		System.out.println(" >>> Parameterize constructor of TestSUperKeyword class");
	}
}
public class SuperKeyWord extends TestSUperKeyword{
	
	SuperKeyWord(){
		super("test");
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
