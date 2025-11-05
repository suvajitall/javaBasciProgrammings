package javabasic;

public class CheckTheCharacter {
	public static void main(String args[]) {
		String str = "A1234B567C890D";
		char[] ch = str.toCharArray();
		int left = 0;
		int right = str.length()-1;
		String rev = "";
		
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
				ch[right]=temp;
				right--;
				left++;
			}
			
		}
		
		for(char ch1 : ch) {
			rev = rev + ch1;
		}
		
		System.out.println(rev);
		
		
		
		
	}
}
