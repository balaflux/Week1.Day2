package week1.Day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {

		int[] nums = { 12,25,12,56,89, 25}; 
		int count=0;
		Arrays.sort(nums);
		System.out.println("Total numbers:  " +nums.length);
		for (int i=0; i<nums.length-1; i++) {
  		  if(nums[i] == nums[i+1])  {
		    			  
	             
    			  System.out.println(nums[i]);  
	            }  	
			
		}
		
		
		
		
	}

}
