package javabasic;
import java.util.*;

public class FromListOfIntegerFindFirstOccuranceElement {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		Set<Integer> st = new LinkedHashSet<>();
		Integer firstNum = null;
		lst.add(10);
		lst.add(9);
		lst.add(15);
		lst.add(13);
		lst.add(15);
		lst.add(13);
		for(int num : lst) {
			if(st.contains(num)) {
				firstNum = num;
				break;
			}
			else {
				st.add(num);
			}
		}
		
		if(firstNum!=null){
			System.out.println(firstNum);
		}else {
			System.out.println("blank");
		}
	}
}
