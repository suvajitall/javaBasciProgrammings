package javabasic;

public class ReverseString {
	public static void main(String args[]) {
		
		/** aproach 1
		String str = "Suvajit Dutta";
		String[] split_string = str.split(" ");
		String rev = "";
		
		for(int i=split_string[0].length()-1;i>=0;i--) {
			rev = rev + split_string[0].charAt(i);
		}		
		
		System.out.println(rev + " " +split_string[1]);*/
		
		/** Approch 2 **/
		
		String str = "Suvajit Dutta";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
		}
		
		
		
	}

