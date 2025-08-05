package javabasic;

public class CheckTheCharacter {
	public static void main(String args[]) {
		String str = "S@#U%!V$#A";
		String rev = "";
		char swaps=' ';
		char[] ch = str.toCharArray();
		int i=0;
		int j = ch.length-1;
		
		while(i < j) {
			if(!Character.isLetterOrDigit(ch[i])) {
				i++;
			}
			else if(!Character.isLetterOrDigit(ch[j])) {
				j--;
			}
			else {
				
				swaps = ch[i];
				ch[i]=ch[j];
				ch[j] = swaps;
				i++;
				j--;
			}
		}
		
		System.out.println("Reversed: " + new String(ch));
	}
}
