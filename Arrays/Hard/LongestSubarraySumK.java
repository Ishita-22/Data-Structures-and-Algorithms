/**
 * Problem Name: Longest Subarray with Sum K
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find longest subarray having sum = k.
 *
 * Pseudocode:
 * 1. Use HashMap for prefix sum
 * 2. Check prefixSum-k existence
 *
 * Approach:
 * Prefix sum with hashmap.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [1,2,3,1,1,1,1], k=3
 * Output: 3
 */

import java.util.*;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] nums,int k) {

        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,max=0;

        for(int i=0;i<nums.length;i++) {

            sum+=nums[i];

            if(sum==k)
                max=i+1;

            if(map.containsKey(sum-k))
                max=Math.max(max,i-map.get(sum-k));

            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,1,1};
        System.out.println(longestSubarray(nums,3));
    }
}
