package javabasic;

public class CountSumOfDigitsInANumber {
	public static void main(String[] args) {
		int num=54321;
		int sum=0;
		int count=0;
		
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
			count++;
		}
		System.out.println(sum);
	}
}
