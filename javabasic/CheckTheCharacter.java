package javabasic;

public class CheckTheCharacter {
	public static void main(String args[]) {
		String str = "A1234B567C890D";
		String str1 = "";
		char[] ch = str.toCharArray();
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if(!Character.isLetter(ch[left])) {
				left++;
			}
			else if(!Character.isLetter(ch[right])) {
				right--;
			}
			else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		
		for(char ch1 : ch) {
			str1 = str1 + ch1;
		}
		
		System.out.println(str1);
		
		
		
		
	}
}
