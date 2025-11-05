package javabasic;
import java.util.*;

public class CountWordFromAStringArray {
	public static void main(String args[]) {
		String[] str = {"Hello world","Hello India","I Love India","Love the code","Hello countery"};
		Map<String,Integer> mp = new LinkedHashMap<>();
		
		for(int i=0;i<str.length;i++) {
			String[] str1 = str[i].split(" ");
			for(int j=0;j<str1.length;j++) {
				mp.put(str1[j],mp.getOrDefault(str1[j], 0)+1);
			}
		}
		
		for(Map.Entry<String,Integer> mp1 : mp.entrySet()) {
			System.out.println(mp1.getKey()+"  ==> "+mp1.getValue());
		}
	}
}
