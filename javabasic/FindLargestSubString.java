package javabasic;

public class FindLargestSubString {
	public static void main(String[] args) {
        String str = "Hello worlddgdfddgdgdgdgdgdgdggdgdgdgdgdg cleverFoxfgdhghfhhghghgghg neverJumpsTwoTimes";
        String[] str_splt = str.split(" ");
        String subString = "";
        String max= str_splt[0];
        String max_subString = "";
       
        for(int i=0;i<str_splt.length;i++) {
        		if(max.length() < str_splt[i].length()) {
        			max = str_splt[i];
        		}
        }
        
        System.out.println(max);
       
    }
}
