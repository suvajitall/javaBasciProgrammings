package javabasic;
import java.util.*;

public class FromListOfIntegerFindFirstOccuranceElement {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);;
		lst.add(5);
		lst.add(1);
		lst.add(2);
		lst.add(3);
		System.out.println(lst);
		
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<lst.size();i++) {
			mp.put(lst.get(i), mp.getOrDefault(lst.get(i), 0)+1);
		}
	}
}
