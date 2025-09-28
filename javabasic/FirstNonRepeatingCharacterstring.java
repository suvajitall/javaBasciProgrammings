package javabasic;
import java.util.*;

public class FirstNonRepeatingCharacterstring {
	public static void main(String args[]) {
		String str = "Programming";
		Map<Character,Integer> mp  = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		
		for(char ch1 : ch) {
			mp.put(ch1, mp.getOrDefault(ch1, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> details : mp.entrySet()) {
			if(details.getValue()==1) {
				System.out.print("First non-repeating character of given string : "+details.getKey());
				break;
			}
		}
	
	}
}
