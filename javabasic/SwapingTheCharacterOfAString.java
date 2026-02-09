package javabasic;

public class SwapingTheCharacterOfAString {
	public static void main(String args[]) {
		String str = "AbCd";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i += 2) {
		    char temp = ch[i];
		    ch[i] = ch[i + 1];
		    ch[i + 1] = temp;
		}
		System.out.println(new String(ch));
	}
}


