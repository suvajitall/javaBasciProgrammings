package javabasic;
import java.util.*;

public class CreateDataSetWithList {
		public static void main(String args[]) {
			Map<String,String> mp1 = new LinkedHashMap<>();
			Map<String,String> mp2 = new LinkedHashMap<>();
			
			mp1.put("Name : ","Suvajit");
			mp1.put("Address : ","Kolkata");
			
			mp2.put("Name : ","Sangita");
			mp2.put("Address : ","Baruipur");
			
			List<Map<String,String>> lst = new ArrayList<>();
			
			lst.add(mp1);
			lst.add(mp2);
			
			for(Map<String,String> details : lst) {
				for(Map.Entry<String,String> mps : details.entrySet()) {
					System.out.println(mps.getKey()+" "+mps.getValue());
				}
				System.out.println("********************");
			}
		}
}
