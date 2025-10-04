package javabasic;

public class CountOfLowerAndUpperCase {
	public static void main(String args[]) {
		String str = "AaBbCcDc1234$#@";
		char[] ch = str.toCharArray();
		int len = ch.length;
		int upper = 0;
		int lower = 0;
		for(char ch1 : ch) {
			if(Character.isUpperCase(ch1)) {
				upper++;
			}
			else if(Character.isLowerCase(ch1)) {
				lower++;
			}
		}
		
		System.out.println("Upper Case: "+upper+" and lower case : "+lower);
	}
}
