package javabasic;
import java.util.Arrays;

public class SeparateZeros {
	public static void main(String args[]) {
		int[] arr = {5,2,0,7,0,1,0,8};
		int[] new_arr= new int[arr.length];
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]==0) {
					new_arr[count]=arr[i];
					count++;
				}
				/*else {
					new_arr[i] = arr[i];
				}*/
			
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0) {
				new_arr[count]=arr[j];
				count++;
			}
		}
		
		for(int arr1 : new_arr) {
			System.out.print(arr1);
		}
	}
}
