package javabasic;

public class SplitAWord {
	public static void main(String args[]) {
		String str = "Phsycology";
		int sub = str.length()/2;
		System.out.println("First half >>>> "+ str.substring(0,sub));
		System.out.println("Second half >>>> "+ str.substring(sub));
	}
}
