package javabasic;

import java.util.Arrays;

public class RotateAnArrayByDCounterclockwiseOrLeft {
	/*** 
    Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
	Output: {3, 4, 5, 6, 1, 2}
	**/
	
	public static void rotation(int arr[]) {
		int temp = arr[0];
		int len = arr.length;
		for(int i=0;i<len-1;i++) {
			arr[i] = arr[i+1];
		}
		
		arr[len-1] = temp;
	}
	
	public static void finalRtotation(int arr[],int d) {
		for(int i=0;i<d;i++) {
			rotation(arr);
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6};
		int d = 2;
		finalRtotation(arr,d);
		System.out.print(Arrays.toString(arr));
		
		
	}
}
