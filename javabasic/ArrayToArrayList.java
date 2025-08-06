package javabasic;
import java.util.*;

public class ArrayToArrayList {
	public static void main(String args[]) {
		int[] arr = {5,2,6,0,8,7,10};
		List<Integer> lst = new ArrayList<>();
		for(int arr1: arr) {
			lst.add(arr1);
		}
		
		System.out.print(lst);
	}
}
