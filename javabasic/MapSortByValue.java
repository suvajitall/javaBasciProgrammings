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
		
			Map<String,String> mp = new LinkedHashMap<>();
			mp.put("A", "10");
			mp.put("B", "20");
			mp.put("C", "-5");
			
			List<Map.Entry<String,String>> lst = new ArrayList<>(mp.entrySet());
			lst.sort(Map.Entry.<String,String>comparingByValue());
			
			System.out.println(lst.toString());
			
	}
	
	
		}

 