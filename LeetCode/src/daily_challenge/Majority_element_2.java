
///////////////////Not Completed : - Trying to Solve

package daily_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Majority_element_2 {
	
	 public List<Integer> majorityElement(int[] nums) {
		 //int[] nums1 = {1, 2, 2, 3}; // Monotonic increasing
		 int n = nums.length;
		 int m = n/3;
		 ArrayList<Integer> p = new ArrayList(); 
		 boolean visited[] = new boolean[n];
		 Arrays.fill(visited, false);
		 
		 for(int i = 0;i<=n-1;i++)
		 {
			 if (visited[i] == true)
		            continue;
			 
			 int count = 1;
			 for(int j=i+1;j<=n-1;j++)
			 {
				 if (nums[i]==nums[j])
				 {
					visited[j] = true;
					count++; 
				 }
			 }	
			 if(count>m) {
			 p.add(count);
			 }
		 }
		 
		 System.out.println(p);
		return null;    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {3,2,3}; // Monotonic increasing
//        int[] nums2 = {7, 6, 5, 3, 2}; // Monotonic decreasing
//        int[] nums3 = {1, 3, 2}; // Not monotonic

        Majority_element_2 s = new Majority_element_2();
        s.majorityElement(nums1);// Output: true

	}

}
