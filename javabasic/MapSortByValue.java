package javabasic;
import java.util.*;

public class MapSortByValue {
	/*public static void main(String args[]) {
		Map<String, String> mp = new HashMap<>();
		mp.put("Orange", "50");
		mp.put("Apple", "90");
		mp.put("Mango", "20");
		
		List<Map.Entry<String,String>> lst = new ArrayList<>(mp.entrySet());
		lst.sort(Map.Entry.<String, String>comparingByValue().reversed());
		
		System.out.print(lst);
	}*/
	
	public static void main(String args[]) {
		Map<String,Integer> mp = new HashMap<>();
		mp.put("Orange",10 );
		mp.put("Orange2",40 );
		mp.put("Orange3",20 );
		
		List<Map.Entry<String,Integer>> lst = new ArrayList<>(mp.entrySet());
		lst.sort(Map.Entry.<String,Integer>comparingByValue());	
		System.out.println(lst);
		}
}
