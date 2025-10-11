package javabasic;

public class CountOfNumber {
	public static void main(String[] args) {
	int num = 12348995;
	int count=0;
	while(num>0) {
		num = num/10;
		count++;
	}
	System.out.println(count);
	}
}
