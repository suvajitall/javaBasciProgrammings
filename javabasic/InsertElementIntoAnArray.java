package javabasic;

import java.util.Arrays;

public class InsertElementIntoAnArray {
	public static void main(String args[]) {
		int[] arr = {1,2,4};
		int el = 5;
		int pos = 1;
		int[] new_arr = new int[arr.length+1];
		
		for(int i=0;i<pos;i++) {
			new_arr[i]=arr[i];
		}
		new_arr[pos]=el;
		
		for(int j=pos+1;j<new_arr.length;j++) {
			new_arr[j]=arr[j-1];
		}
		
		for(int arr1 : new_arr) {
			System.out.println(arr1);
		}
		
		
		
	}
}
