/**
 * Problem Name: Find Missing Number
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given an array containing n distinct numbers in range [0,n],
 * find the missing number.
 *
 * Pseudocode:
 * 1. Calculate expected sum = n*(n+1)/2
 * 2. Calculate actual sum of array
 * 3. Missing = expected - actual
 *
 * Approach:
 * Use sum formula to detect missing value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [3,0,1]
 * Output: 2
 */

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int expected = n * (n + 1) / 2;

        int sum = 0;
        for(int num : nums)
            sum += num;

        return expected - sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
