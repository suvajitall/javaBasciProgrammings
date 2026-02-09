package javabasic;

public class SearchALetterInString {
	public static void main(String args[]) {
		String str = "Suvajit Dutta";
		char srch = 'D';
		char[] ch = str.toCharArray();
		for(char ch1 : ch) {
			if(ch1 == srch) {
				System.out.println(ch1);
			}
		}
	}
}
