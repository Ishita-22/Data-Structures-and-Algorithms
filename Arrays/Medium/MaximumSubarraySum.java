/**
 * Problem Name: Maximum Subarray Sum
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the contiguous subarray with the maximum sum.
 *
 * Pseudocode:
 * 1. Initialize maxSum = arr[0], currSum = arr[0]
 * 2. Traverse from 1 to n-1:
 *    - currSum = max(arr[i], currSum + arr[i])
 *    - maxSum = max(maxSum, currSum)
 *
 * Approach:
 * Use Kadane’s Algorithm for optimal subarray sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 */

public class MaximumSubarraySum {

    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
