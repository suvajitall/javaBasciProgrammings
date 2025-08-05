package Interview_questuons;
import java.util.*;

public class DuplicateWordsInString {
	
	public void search_duplicate(String str) {
		char[] ch = str.toCharArray();
		int len = str.length();
		LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
		for(int i=0;i<len;i++) {
			//mp.put(ch[i],i);
			mp.put(ch[i],mp.getOrDefault(ch[i],0)+1);
			
		}
		
		for(Map.Entry<Character,Integer> value : mp.entrySet()) {
			
			/*if(value.getValue()>=2) {
				System.out.print(value.getKey());
			}*/
			System.out.println(value.getKey() + " : "+value.getValue());
			
		}
		
		
	}
	
	public static void main(String args[]) {
		DuplicateWordsInString obj = new DuplicateWordsInString();
		obj.search_duplicate("Clever fox never jumps 2 times");
	}
}
