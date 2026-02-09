package InterfacePrograms;


interface AreaBluePrint{
	void getArea();
}

class Rectangle implements AreaBluePrint{
	public void getArea() {
		System.out.println("This is Rectangle");
	}
}

class Circle implements AreaBluePrint{
	public void getArea() {
		System.out.println("This is Circle");
	}
}

class Triangle implements AreaBluePrint{
	public void getArea() {
		System.out.println("This is Triangle");
	}
}
public class Area {
	public static void main(String args[]) {
	//	AreaBluePrint obj = new Triangle();
	//	AreaBluePrint obj = new Circle();
		AreaBluePrint obj = new Triangle();
		obj.getArea();
	}
}
