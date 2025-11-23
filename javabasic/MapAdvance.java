package javabasic;
import java.util.*;

public class MapAdvance {
	public static void main(String str[]) {
		Map<String,String> mp = new LinkedHashMap<>();
		mp.put("A", "Apple");
		mp.put("B", "Ball");
		mp.put("C", "Cat");
		
		System.out.println(mp.entrySet());
	}
}
