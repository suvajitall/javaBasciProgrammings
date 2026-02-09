package This;


class Test{
	Test(){
		System.out.println("This is Test constructor");
		}
}

public class TestThis extends Test {
	
	TestThis(){
		//super();
		//System.out.println("This is TestThis constructor");
	//	this(10);
	}
	
	/*TestThis(int i){
		System.out.println(i);
	}*/
	public static void main(String args[]){
		TestThis obj = new TestThis();
		
	}
}
