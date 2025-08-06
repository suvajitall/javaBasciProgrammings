package javabasic;
import java.util.*;

public class FindDuplicateElementFromArray {
	public static void main(String args[]) {
		int[] arr = {1,0,5,2,4,1,2,0,6,};
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);	
		}
		
		for(Map.Entry<Integer,Integer> val : mp.entrySet()) {
			if(val.getValue()>=2) {
				System.out.println(val.getKey());
			}
		}
	}
}
