/**
 * Problem Name: Subarray Sum Equals K
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the total number of continuous subarrays whose sum equals k.
 *
 * Pseudocode:
 * 1. Use HashMap to store prefixSum frequency
 * 2. Traverse array:
 *    - prefixSum += num
 *    - If map contains (prefixSum - k) → add its frequency
 *    - Store prefixSum in map
 *
 * Approach:
 * Use prefix sum + hashmap to count subarrays efficiently.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 */

import java.util.*;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        int count = 0;

        for(int num : nums) {
            prefixSum += num;

            if(map.containsKey(prefixSum - k))
                count += map.get(prefixSum - k);

            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums,2));
    }
}
