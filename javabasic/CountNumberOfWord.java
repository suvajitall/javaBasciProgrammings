package javabasic;

public class CountNumberOfWord {
		public static void main(String args[]) {
			String str = "hellow world";
			String[] split = str.split(" ");
			System.out.println(split.length);
		}
}
