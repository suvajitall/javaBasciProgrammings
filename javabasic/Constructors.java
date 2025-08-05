package javabasic;
class Test_constructoe{
	private String name1;
	private String address1;
	Test_constructoe(String name,String address){
		this.name1=name;
		this.address1=address;
	}
	public Test_constructoe() {
		System.out.println("this is blank constructor");
	}
	
	public void get_details() {
		System.out.println(name1);
		System.out.println(address1);
	}
	
}
public class Constructors {
	public static void main(String args[]) {
		Test_constructoe obj1 = new Test_constructoe("Suvajit Dutta","Kolkata");
		obj1.get_details();
		Test_constructoe obj2 = new Test_constructoe();
	}
	
}
