package javabasic;

public class ReversWord {
	public static void main(String args[]) {
		String str = "Hello world";
		String splt[] = str.split(" ");
		String rev_Str = "";
		int j=0;
		
		for(String splt1 : splt) {
			char[] ch = splt1.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				rev_Str = rev_Str + ch[i];
				 
			}
			if(j < splt1.length()-1) {
				rev_Str = rev_Str + " ";
				j++;
			}
		}
		
		System.out.println(rev_Str.trim());
		
	}
}
