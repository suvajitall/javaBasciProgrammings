package javabasic;
import java.util.*;

public class CheckVowels {
	public static void main(String args[]) {
		String str = "Clever dog never jumps one time";
		String vwl = "AEIOUaeiou";
		char[] ch = str.toCharArray();
		Map<Character,Integer> mp = new HashMap<>();
		
		
		for(char ch1 : ch) {
			if(vwl.indexOf(ch1)!=-1) {
				//System.out.println(ch1+" --> This is vowel.");
				mp.put(ch1,mp.getOrDefault(ch1,0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> mp1 : mp.entrySet()) {
			System.out.println(mp1.getKey()+" ==> "+mp1.getValue());
		}
	}
}