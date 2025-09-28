package javabasic;
import java.util.*;

public class FindDuplicateElementFromArray {
	public static void main(String args[]) {
		int[] arr = {1,0,5,2,4,1,2,0,6,};
		Map <Integer,Integer> mp = new LinkedHashMap<>();
		for(int arr1 : arr) {
			mp.put(arr1, mp.getOrDefault(arr1, 0)+1);
			
		}
		for(Map.Entry<Integer,Integer> dtls : mp.entrySet()) {
			if(dtls.getValue()>=2) {
				System.out.println(dtls.getKey() + " --> "+dtls.getValue());
			}
		}
	}
}
