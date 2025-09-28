package javabasic;

public class ReversWord {
	public static void main(String args[]) {
		String str = "Hello world";
		String[] spl = str.split(" ");
		StringBuilder stb = new StringBuilder();
		
		for(int i=0; i<spl.length;i++) {
			for(int j=spl[i].length()-1;j>=0;j--) {
				stb.append(spl[i].charAt(j));
			}
			 if (i < spl.length - 1) {
				 stb.append(" ");
	            }
		}
		
		System.out.print(stb);
		
	}
}
