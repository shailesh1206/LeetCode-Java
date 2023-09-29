/*An array is monotonic if it is either monotone increasing or monotone decreasing.An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
Given an integer array nums, return true if the given array is monotonic, or false otherwise.*/


package algorithmsEasy;

public class MontonicArray {

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            } else if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }

            // If neither increasing nor decreasing, we can exit early.
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3}; // Monotonic increasing
        int[] nums2 = {7, 6, 5, 3, 2}; // Monotonic decreasing
        int[] nums3 = {1, 3, 2}; // Not monotonic

        System.out.println(isMonotonic(nums1)); // Output: true
        System.out.println(isMonotonic(nums2)); // Output: true
        System.out.println(isMonotonic(nums3)); // Output: false
    }
}


 