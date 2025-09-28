package javabasic;

import java.util.Arrays;

public class InsertElementIntoAnArray {
	public static void main(String args[]) {
		int[] arr = {1,2,4};
		int new_el = 5;
		int pos = 2;
		int new_arr[] = new int[arr.length+1];
		
		for(int i=0;i<pos;i++) {
			new_arr[i] = arr[i];
		}
		
		new_arr[pos] = new_el;
		
		for(int i=pos+1;i<new_arr.length;i++) {
			new_arr[i]=arr[i-1];
		}
		
		for(int arr1  : new_arr) {
			System.out.println(arr1);
		}
	}
}
