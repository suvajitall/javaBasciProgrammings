package javabasic;
import java.util.*;

public class ArrayToArrayList {
	public static void main(String args[]) {
		int[] arr = {2,5,1,0,5,7};
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			lst.add(arr[i]);
		}
		
		System.out.println(lst);
	}
}
