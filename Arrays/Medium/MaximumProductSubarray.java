/**
 * Problem Name: Maximum Product Subarray
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the contiguous subarray with the maximum product.
 *
 * Pseudocode:
 * 1. Initialize maxProd, minProd, result
 * 2. Traverse array:
 *    - Swap max and min if num < 0
 *    - Update maxProd, minProd
 *
 * Approach:
 * Track both max and min due to negative numbers.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [2,3,-2,4]
 * Output: 6
 */

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            result = Math.max(result,max);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
