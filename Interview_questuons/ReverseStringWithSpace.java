package Interview_questuons;

public class ReverseStringWithSpace {
	public static void main(String args[]) {
		String str = "Clever dog jumps 1 time";
		String rev_str = "";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			rev_str = rev_str + str.charAt(i);
		}
		
		System.out.print(rev_str);
		
	}
}
