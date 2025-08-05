package Interview_questuons;

public class MoveAllZerosToEnd {
	public static void main(String args[]) {
		int[] arr = {0,5,2,9,0,3,0,1,0,7,0};
		int len = arr.length;
		int[] new_arr = new int[len];
		int temp=0;
		
		for(int i=0;i<len;i++) {
			if(arr[i]!=0) {
				new_arr[temp]=arr[i];
				temp++;
			}
		}
		
		for(int j=0;j<len;j++) {
			if(arr[j]==0) {
				new_arr[temp]=arr[j];
				j++;
			}
		}
		
		for(int new_arr1 : new_arr) {
			System.out.print(new_arr1);
		}
	}
}
