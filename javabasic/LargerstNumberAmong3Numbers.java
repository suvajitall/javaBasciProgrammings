package javabasic;

import java.util.Scanner;

public class LargerstNumberAmong3Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		System.out.println("Enter third number : ");
		int c = sc.nextInt();
		
		//System.out.print("a =>"+a+", b =>"+b+", c=>"+c);
		
		if(a>b && a>c) {
			System.out.println("a =>"+a);
		}
		else if(b>a && b>c) {
			System.out.println("b =>"+b);
		}
		else {
			System.out.println("c =>"+c);
		}
		
	}
	
}
