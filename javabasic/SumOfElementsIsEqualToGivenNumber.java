package javabasic;

public class SumOfElementsIsEqualToGivenNumber {
	public static void main(String args[]) {
		int[] arr = {10,5,-10,6,4,2,20,0,8};
		int givenNum = 10;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==givenNum) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+10);
				}
			}
		}
	}
}
