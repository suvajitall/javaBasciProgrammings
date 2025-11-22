package javabasic;

public class RemoveWhiteSpace {
	public static void main(String argsp[]) {
		String str = "Hello world";
		String str1 = "";
		char[] ch = str.toCharArray();
		for(char ch1 : ch) {
			if(Character.isLetterOrDigit(ch1)) {
				str1 = str1 + ch1;
			}
		}
		System.out.println(str1);
	} 
}
