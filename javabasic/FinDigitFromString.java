package javabasic;

public class FinDigitFromString {
	public static void main(String args[]) {
		String str = "Hello world 32";
		char[] ch = str.toCharArray();
		int sum = 0;
		String new_string="";
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				sum = sum +Character.getNumericValue(ch[i]);
			}else {
				new_string = new_string + ch[i];
			}
		}
		
		System.out.println(new_string+" "+sum);
	}
}
