package javabasic;

public class RemoveWhiteSpace {
	public static void main(String argsp[]) {
		String str = "Hello world";
		String rv = "";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				rv = rv + ch[i];
			}
		}
		
		System.out.println(rv);
	}
}
