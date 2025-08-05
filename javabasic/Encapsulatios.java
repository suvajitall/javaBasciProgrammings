package javabasic;

class Enc{
	private String name;
	private String address;
	public void set_details(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void get_employee_details() {
		System.out.println("Employee name : "+name);
		System.out.println("Employee address : "+address);
	}
}
public class Encapsulatios {
	public static void main(String args[]) {
		Enc emp = new Enc();
		emp.set_details("Suvajit","Kolkata");
		emp.get_employee_details();
	}
}
