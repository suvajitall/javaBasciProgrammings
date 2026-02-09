package javabasic;
import java.util.*;

public class CountDigitOccuranceInAnArray {
	public static void main(String args[]) {
		int[] arr = {2,5,2,8,1,5,0,7,0};
		Map<Integer,Integer> mp = new LinkedHashMap<>();
		for(int arr1 : arr) {
			mp.put(arr1,mp.getOrDefault(arr1,0)+1);
		}
		for(Map.Entry<Integer,Integer> mp1 : mp.entrySet()) {
			System.out.println(mp1.getKey()+" ==> "+mp1.getValue());
		}
		
	}
}
