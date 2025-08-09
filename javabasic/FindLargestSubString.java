package javabasic;

public class FindLargestSubString {
	public static void main(String[] args) {
        String str = "Hello world cleverFoxfgdhghfhhghghgghg neverJumpsTwoTimes";
        String[] splt = str.split(" ");
        String swp="";
        String max=splt[0];
        
        for(int i=0;i<splt.length;i++){
            /*for(int j=0;j<splt.length;j++){
                if(splt[i].length() > splt[j].length()){
                    swp = splt[i];
                    splt[i] = splt[j];
                    splt[j] = swp;
                }
            }*/
        	
        	////////// 2nd approach ////////
        	
        	if(splt[i].length() >= max.length()) {
        		max = splt[i];
        	 }
        }
        
        System.out.println(max);
    }
}
