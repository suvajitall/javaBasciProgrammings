package javabasic;

public class SecondLargestElement {
	public static void main(String args[]) {
		int[] arr = {2,0,5,10,1,9};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count=arr[i];
					arr[i]=arr[j];
					arr[j]=count;
				}
			}
		}
		
		/*for(int arr1 : arr) {
			System.out.println(arr1);
		}*/
		System.out.println(arr[1]);
	}
}
