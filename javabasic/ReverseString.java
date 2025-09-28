package javabasic;

public class ReverseString {
	public static void main(String args[]) {
		
		
		
		String name = "S^&*U@@!V++A";
		
		String str1 = "";
		char[] ch = name.toCharArray();
		int left = 0;
		int right = name.length()-1;
		
		while(left < right) {
			if(!Character.isLetterOrDigit(ch[left])) {
				left++;
			}
			else if(!Character.isLetterOrDigit(ch[right])) {
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
		System.out.print(new String(ch));
		}
		
		
		
	}

