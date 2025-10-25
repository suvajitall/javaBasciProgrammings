package javabasic;
import java.util.*;

public class CountWordFromAStringArray {
	public static void main(String args[]) {
		String[] str = {"Hello world","Hello India","I Love India","Love the code","Hello countery"};
		Map<String,Integer> mp = new LinkedHashMap<>();
		for(String str1 : str) {
			String splt[] = str1.split(" ");
			for(String splt1 : splt) {
				mp.put(splt1,mp.getOrDefault(splt1,0)+1);
			}
		}
		
		for(Map.Entry<String,Integer> mp1 : mp.entrySet()) {
			System.out.println(mp1.getKey()+" --> "+mp1.getValue());
		}
	}
}
