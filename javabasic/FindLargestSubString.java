package javabasic;

public class FindLargestSubString {
	public static void main(String[] args) {
        String str = "Hello worlddgdfddgdgdgdgdgdgdggdgdgdgdgdg cleverFoxfgdhghfhhghghgghg neverJumpsTwoTimesvhgfhfhfhgfhfhfhfhfhfhfhfhfhfhfhfh";
        String[] str1 = str.split(" ");
        String max = str1[0];
        
        for(int i=0;i<str1.length;i++) {
        		
        			if(max.length() < str1[i].length()) {
        				max = str1[i];
        			}
        		
        }
        
        System.out.println(max);
        
       
    }
}
