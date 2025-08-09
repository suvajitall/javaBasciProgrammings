package javabasic;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String str = "Suva%$#@ji34t";
		String strs = "";
		char[] ch = str.toCharArray();
		for(char ch1 : ch ) {
			if(Character.isLetter(ch1)) {
				
					strs = strs + ch1;
			}
		}
		System.out.println(strs);
	}
}
