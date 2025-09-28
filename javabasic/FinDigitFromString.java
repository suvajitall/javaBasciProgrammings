package javabasic;

public class FinDigitFromString {
	public static void main(String args[]) {
		String str = "Hello world 32";
		int sum = 0;
		char[] ch = str.toCharArray();
		for(char ch1 : ch) {
			if(Character.isDigit(ch1)) {
				sum = sum + Character.getNumericValue(ch1);
			}
		}
		
		System.out.println(sum);
	}
}
