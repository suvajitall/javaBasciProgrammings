package javabasic;

public class ReplaceAllOccurrencesOfSubstring {
	public static void main(String args[]) {
		String str = "geeksforgeeks";
		String s1 = "eek", s2 = "ok";
		
		StringBuilder sbd  = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-s1.length() && str.substring(i,i+s1.length()).equals(s1)) {
				sbd.append(s2);
			}else {
				sbd.append(str.charAt(i));
			}
		}
		
		System.out.print(sbd.toString());
	}
}
