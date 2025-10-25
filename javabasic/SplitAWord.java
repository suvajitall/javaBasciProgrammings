package javabasic;

public class SplitAWord {
	public static void main(String args[]) {
		String str = "Phsycology";
		int mid = str.length()/2;
		
		String first_half = str.substring(0,mid);
		System.out.println("First half --> "+first_half);
		System.out.println("Second Half --> "+ str.substring(mid));
	}
}
