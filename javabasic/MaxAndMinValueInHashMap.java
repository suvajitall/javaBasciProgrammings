package javabasic;
import java.util.*;

public class MaxAndMinValueInHashMap {
	public static void main(String args[]) {
		String str = "I am Indian man no doubt";
		
		Map<Character, Integer> mp = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length; i++) {
			
			if(Character.isLetter(ch[i])) {
				mp.put(ch[i], mp.getOrDefault(ch[i], 0)+1);
			}
		}
		int min = Collections.min(mp.values());
		int max = Collections.max(mp.values());
		
		for(Map.Entry<Character, Integer> mp1 : mp.entrySet()) {
			if(min==mp1.getValue()) {
				System.out.println(mp1.getKey()+" -- >>"+mp1.getValue());
			}
			else if(max==mp1.getValue()) {
				System.out.println(mp1.getKey()+" -- >>"+mp1.getValue());
			}
		}
		
	}
}
