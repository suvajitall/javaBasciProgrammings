package javabasic;

import java.util.Arrays;

public class InsertElementIntoAnArray {
	public static void main(String args[]) {
		
		int[] arr = {2,6,1,5};
		int[] arr1 = new int[arr.length+1];
		
		int num=3, pos=2;
		
		for(int i=0;i<pos;i++) {
			arr1[i]=arr[i];
		}
		
		arr1[pos]=num;
		
		for(int j=pos+1;j<arr1.length;j++) {
			arr1[j]=arr[j-1];
		}
		
		for(int arr3 : arr1) {
			System.out.println(arr3);
		}
		
	}
}
