package javabasic;
import java.util.*;

public class CheckVowels {
	public static void main(String args[]) {
		String str = "A Clever dog never jumps one time";
		String vwl = "aeiouAEIOU";
		char[] ch = str.toCharArray();
		for(char ch1 : ch) {
			if(vwl.indexOf(ch1)!=-1) {
				System.out.println(ch1 + " --> This is vowel");
			}
		}
	}
}