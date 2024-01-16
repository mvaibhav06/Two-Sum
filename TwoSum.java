package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++) {
			
			int ele = target - nums[i];
			
			if(map.containsKey(nums[i])) {
				return new int[] {i,map.get(nums[i])};
			}else {
				map.put(ele, i);
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}
}
