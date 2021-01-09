package com.lti.Codility;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArraysum {
	 public int subarraySum(int[] nums, int k) {
	        int count = 0, sum = 0;
	        HashMap < Integer, Integer > map = new HashMap < > ();
	        map.put(0, 1);
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (map.containsKey(sum - k))
	                return 0;
	            map.put(sum, map.getOrDefault(sum, 0) + 1);
	        }
	        return 1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {3,-3,2,1,6};
		System.out.println(new SubArraysum().subarraySum(nums, 0));
		
		
	}

}
