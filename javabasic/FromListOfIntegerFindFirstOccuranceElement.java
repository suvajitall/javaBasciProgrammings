package javabasic;
import java.util.*;

public class FromListOfIntegerFindFirstOccuranceElement {
	public static void main(String[] args) {
		Set<Integer> st = new LinkedHashSet<>();
		Integer firstNum = null;
		st.add(10);
		st.add(12);
		st.add(15);
		st.add(11);
		st.add(12);
		for(int num : st) {
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
