package javabasic;
import java.util.*;

public class MaxAndMinValueInHashMap {
	public static void main(String args[]) {
		String str = "I am Indian man no doubt";
		char[] ch = str.toCharArray();
		Map<Character,Integer> mp = new LinkedHashMap<>();
		for(char ch1 : ch) {
			mp.put(ch1, mp.getOrDefault(ch1,0)+1);
		}
		int max = Collections.max(mp.values());
		int min = Collections.min(mp.values());

		for(Map.Entry<Character, Integer> mp1 : mp.entrySet()) {
			if(mp1.getValue()==max) {
				System.out.println(mp1.getKey());
			}
			else if(mp1.getValue()==min) {
				System.out.println(mp1.getKey());
			}
		}
	}
}
