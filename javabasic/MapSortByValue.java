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
			Map<String, Integer> mp = new LinkedHashMap<>();
			mp.put("Apple",20);
			mp.put("Orange",30);
			mp.put("Mango",10);
			mp.put("Guava",50);
			List<Map.Entry<String,Integer>> lst = new ArrayList<>(mp.entrySet());
			lst.sort(Map.Entry.<String,Integer>comparingByValue().reversed());
			System.out.println(lst);
			
			}
		}

