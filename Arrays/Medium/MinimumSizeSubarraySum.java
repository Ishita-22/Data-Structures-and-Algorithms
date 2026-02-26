/**
 * Problem Name: Minimum Size Subarray Sum
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the minimal length of a contiguous subarray of which sum ≥ target.
 *
 * Pseudocode:
 * 1. Use sliding window
 * 2. Expand right pointer adding sum
 * 3. While sum ≥ target:
 *    - update minLength
 *    - shrink left pointer
 *
 * Approach:
 * Use sliding window to find minimum length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: target=7, nums=[2,3,1,2,4,3]
 * Output: 2
 */

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while(sum >= target) {
                minLen = Math.min(minLen, right-left+1);
                sum -= nums[left++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
}
