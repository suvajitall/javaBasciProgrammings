package javabasic;
import java.util.*;

public class MapList {
	public static void main(String args[]) {
		
		List<Map<String,String>> lst = new ArrayList<>();
		
		Map<String, String> mp = new LinkedHashMap<>();
		mp.put("name", "Suvajit");
		mp.put("org","Infosys");
		
		Map<String, String> mp2 = new LinkedHashMap<>();
		mp2.put("name", "Ram");
		mp2.put("org","TCS");
		
		lst.add(mp);
		lst.add(mp2);
		int i=0;
		
		for(Map<String, String> details : lst) {
			i++;
			System.out.println("Details of candidate : "+ i);
			for(Map.Entry<String, String> emp : details.entrySet()) {
				
				System.out.println(emp.getKey()+" : "+emp.getValue());
			}
			System.out.println("*******************************************");
		}
		
		/*for(Map.Entry<String, String> emp : mp.entrySet()) {
			
			System.out.println(emp.getKey()+" : "+emp.getValue());
		}*/
	}
}
