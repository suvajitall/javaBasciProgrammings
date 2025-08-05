package javabasic;

public class SwapNumbers {
	public static void main(String args[]) {
		int a = 30;
		int b=35;
		b = a+b;
		a = b-a;
		b = b-a;
		
		System.out.println(a + " : "+ b);
	}
}
