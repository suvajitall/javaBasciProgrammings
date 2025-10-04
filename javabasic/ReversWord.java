package javabasic;

public class ReversWord {
	public static void main(String args[]) {
		String str = "Hello world";
		char[] ch = str.toCharArray();
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}
}
