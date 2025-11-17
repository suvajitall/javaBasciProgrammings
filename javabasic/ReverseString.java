package javabasic;

public class ReverseString {
	public static void main(String args[]) {
		
		
		
		String name = "S^&*U@@!V++A";
		//A^&*V@@!U++S
		
		String str1 = "";
		char[] ch = name.toCharArray();
		
		int left=0;
		int right = name.length()-1;
		
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

