package javabasic;
import java.util.*;

public class UniqueSubString {
	public static void main(String args[]) {
		String str = "aabbccavvaabbcabc";
		Set<String> st = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				st.add(str.substring(i,j));
			}
		}
		
		System.out.println(st);
	}
}
