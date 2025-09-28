package javabasic;
import java.util.*;

public class CreateDataSetWithList {
		public static void main(String args[]) {
			Map<String,String> mp1 = new LinkedHashMap<>();
			Map<String,String> mp2 = new LinkedHashMap<>();
			
			mp1.put("Suvajit", "20");
			mp1.put("Address", "Kolkata");
			mp1.put("Org", "TCS");
			
			mp2.put("Surajit", "20");
			mp2.put("Address", "Kolkata");
			mp2.put("Org", "Apple");
			
			List<Map<String,String>> lst = new ArrayList<>();
			
			lst.add(mp1);
			lst.add(mp2);
			
			for(Map<String,String> details : lst) {
				for(Map.Entry<String, String> val : details.entrySet()) {
					System.out.println(val.getKey() + " >> "+val.getValue());
				}
				System.out.println("/*******************/");
			}
		}
}
