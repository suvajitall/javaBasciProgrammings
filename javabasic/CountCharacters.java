package javabasic;
import java.util.*;

public class CountCharacters {
	public static void main(String args[]) {
		String str = "Suvajit Dutta";
		Map<Character,Integer> mp = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			mp.put(ch[i], mp.getOrDefault(ch[i],0)+1);
			
		}
		System.out.println(mp.entrySet());
		System.out.println("==================================================");
		/*for(Map.Entry<Character,Integer> count : mp.entrySet()) {
			System.out.println(count.getKey()+" :: "+count.getValue());
		}*/
		
	}
}
