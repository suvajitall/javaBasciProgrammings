package javabasic;

public class ReverseString {
	public static void main(String args[]) {
		
		
		
		String name = "S^&*U@@!V++A";
		
		String str1 = "";
		
		char[] ch = name.toCharArray();
		
		int left=0;
		int right=name.length()-1;
		
		while(left<right) {
				if(!Character.isLetterOrDigit(ch[left])) {
					left++;
					//right--;
				}
				else if(!Character.isLetterOrDigit(ch[right])) {
					right--;
				}
				else {
					char swap = ch[left];
					ch[left]=ch[right];
					ch[right]=swap;
					left++;
					right--;
				}
			}
		
		for(int i=0;i<ch.length;i++) {
			str1 = str1+ch[i];
		}
		System.out.println(str1);
		
	}	
		
	}

