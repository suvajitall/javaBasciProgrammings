package javabasic;
import java.util.*;

public class MapList {
	public static void main(String args[]) {
		List<Map<String,String>> lst = new ArrayList<>();
		Map<String,String> mp = new LinkedHashMap<>();
		mp.put("Ram","10");
		mp.put("Address","India");
		mp.put("Age","50");
		
		Map<String,String> mp1 = new LinkedHashMap<>();
		mp1.put("Shyam","20");
		mp1.put("Address","Pakistan");
		mp1.put("Age","60");
		
		lst.add(mp);
		lst.add(mp1);
		
		for(Map<String,String> details : lst){
			for(Map.Entry<String,String> details1 : mp.entrySet()){
				System.out.println(details1.getKey()+"-->"+details1.getValue());
			}
			System.out.println("*****************************");
		}
	}
}
