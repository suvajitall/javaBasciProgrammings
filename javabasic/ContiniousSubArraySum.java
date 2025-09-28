package javabasic;

public class ContiniousSubArraySum {
	
		 public static void main(String[] args) {
		        int[] arr = {1, 4, 20, 3, 10, 5};
		        int targetSum = 33;
		        int sum=0;
		        
		        int left=0;
		        int right = 0;
		        
		        
		        for(left=0;left<arr.length;left++) {
		        		sum = sum + arr[left];
		        		
		        		while(sum > targetSum && left > right) {
		        			sum = sum-arr[right];
		        			right++;
		        		}
		        		if(sum==targetSum) {
				        	System.out.println(right +" : "+left);
				        }
				        
		        		
		        }
		        
		    }
}

