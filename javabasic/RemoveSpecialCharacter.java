package javabasic;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String str = "Suva% $# @ji 34t";
		String str1="";
		char[] ch = str.toCharArray();
		
		for(char ch1 : ch){
			if(Character.isLetterOrDigit(ch1)){
				str1 = str1 + ch1;
			}
		}
		
		System.out.println(str1);
	} 
}
