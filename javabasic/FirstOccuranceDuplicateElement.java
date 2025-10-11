package javabasic;
import java.util.*;

public class FirstOccuranceDuplicateElement {
	public static void main(String[] args) {
	List<Integer> lst = new ArrayList<>();
	lst.add(1);;
	lst.add(5);
	lst.add(1);
	lst.add(2);
	lst.add(3);
//	System.out.println(lst);
	
	Set<Integer> st = new LinkedHashSet<>();
	for(int i=0;i<lst.size();i++) {
		if(st.contains(lst.get(i))) {
			System.out.println("This is the first duplicate element ==>"+lst.get(i));
		}
		st.add(lst.get(i));
	}
	}
}
