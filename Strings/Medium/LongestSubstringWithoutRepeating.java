/**
 * Problem Name: Longest Substring Without Repeating Characters
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given a string s, find the length of the longest substring
 * without repeating characters.
 *
 * Pseudocode:
 * 1. Use sliding window with HashSet
 * 2. Expand right pointer
 * 3. Remove characters until no duplicates
 * 4. Track max length
 *
 * Approach:
 * Sliding window technique ensures each character is processed once.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "abcabcbb"
 * Output: 3
 */

import java.util.*;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
