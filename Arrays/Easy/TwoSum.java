/**
 * Problem Name: Two Sum
 * Difficulty: Easy
 *
 * Problem Statement:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * Pseudocode:
 * 1. Create a HashMap.
 * 2. Iterate through array:
 *    - Calculate complement = target - nums[i]
 *    - If complement exists in map → return indices
 *    - Else store nums[i] in map with index
 *
 * Approach:
 * Use HashMap to store visited numbers and their indices for O(1) lookup.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
