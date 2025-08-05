package javabasic;
import java.util.*;

public class CheckVowels {
	public static void main(String args[]) {
		String str = "A clever fox never jumps one time";
		String vwl = "aeiouAEIO";
		Set<Character> st = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(vwl.indexOf(ch)!=-1) {
				//System.out.println("Vowel found: "+ ch);
				st.add(ch);
			}
		}
		System.out.println(st);
		System.out.println(st.size());
	}
}
