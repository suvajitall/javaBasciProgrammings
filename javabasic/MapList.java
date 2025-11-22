package javabasic;
import java.util.*;

public class MapList {
	public static void main(String args[]) {
		List<Map<String,String>> lst = new ArrayList<>();
		Map<String,String>mp=new HashMap<>();
		mp.put("Name","Suvajit");
		mp.put("Age","30");
		mp.put("Location","Bangalore");

		Map<String,String>mp1=new LinkedHashMap<>();
		mp1.put("Name","Ram");
		mp1.put("Age","31");
		mp1.put("Location","Kolkata");
		
		lst.add(mp);
		lst.add(mp1);
		
		for(Map<String,String> details : lst) {
			
			for(Map.Entry<String,String> details1 : details.entrySet()) {
				System.out.println(details1.getKey() + " : "+details1.getValue());
			}
			
			System.out.println("*********************************");
		}
	}
}


