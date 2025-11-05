package javabasic;

public class SplitAWord {
	public static void main(String args[]) {
		String str = "Phsycology";
		int n = str.length()/2;
		System.out.println(str.substring(0,n));
		System.out.println(str.substring(n));
	}
}
