package javabasic;

public class CountUpperCaseLowerCase {
	public static void main(String args[]) {
		String str = "HellOw World";
		char[] ch = str.toCharArray();
		int upperCase = 0;
		int lowerCase = 0;
		for(char ch1 : ch) {
			if(Character.isUpperCase(ch1)) {
				upperCase++;
			}else if(Character.isLowerCase(ch1)) {
				lowerCase++;
			}
		}
		System.out.println("Upper case : "+upperCase+ " And Lower Case : "+lowerCase);
}
}