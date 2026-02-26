/**
 * Problem Name: Longest Consecutive Sequence
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the length of the longest consecutive elements sequence.
 *
 * Pseudocode:
 * 1. Add all elements to HashSet
 * 2. For each element:
 *    - If num-1 not in set → start sequence
 *    - Count consecutive numbers
 *
 * Approach:
 * Use HashSet to detect sequence starts.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [100,4,200,1,3,2]
 * Output: 4
 */

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);

        int longest = 0;

        for(int num : set) {
            if(!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while(set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest,count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
