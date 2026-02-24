/**
 * Problem Name: Product of Array Except Self
 * Difficulty: Medium
 *
 * Problem Statement:
 * Return an array where each element is the product of all elements except itself.
 *
 * Pseudocode:
 * 1. Create left[] and right[]
 * 2. Fill left[i] = product of elements before i
 * 3. Fill right[i] = product of elements after i
 * 4. result[i] = left[i] * right[i]
 *
 * Approach:
 * Use prefix and suffix product arrays.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [1,2,3,4]
 * Output: [24,12,8,6]
 */

import java.util.*;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 1;
        for(int i = 0; i < n; i++) {
            result[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for(int i = n-1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
