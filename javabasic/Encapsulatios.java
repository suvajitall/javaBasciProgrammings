package javabasic;

class Enc{
	private String name;
	private String address;
	
	public void set_details(String name1,String address1) {
		this.name = name1;
		this.address = address1;
	}
	
	public void get_employee_details() {
		System.out.println(name +" ==> "+address);
	}
}
public class Encapsulatios {
	public static void main(String args[]) {
		Enc emp = new Enc();
		emp.set_details("Suvajit","Kolkata");
		emp.get_employee_details();
	}
}
