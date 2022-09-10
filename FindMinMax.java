package week1.Day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		
	    Arrays.sort(nums);
	    
	    int min = nums[0];
	    System.out.println(min);	
	    
	    int max = nums[nums.length-1];
	    System.out.println(max);

	}

}
