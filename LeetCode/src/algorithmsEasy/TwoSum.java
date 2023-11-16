package algorithmsEasy;

import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	 int[] s = new int[2];
    	for (int i = 0; i <= nums.length-1; i++) {
    		for (int j = i+1; j <= nums.length-1; j++) { // Fixed the loop increment from i++ to j++
    			if ((nums[i] + nums[j]) == target) {
    				s[0] = i;
    				s[1] = j;
    			}
    		}
    	}
		return s;  
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {6,4,7,3};
        int target = 9;
        Solution m = new Solution();
        int[] q = m.twoSum(nums, target);
        System.out.println("[" + q[0] + "," + q[1] + "]");
    }
}
