package javabasic;

public class CheckTheCharacter {
	public static void main(String args[]) {
		String str = "A1234B567C890D";
		String new_str = "";
		int left=0;
		int right=str.length()-1;
		char[] ch = str.toCharArray();
		
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
			new_str = new_str + ch1;
		}
		
		System.out.println(new_str);
		
		
	}
}
