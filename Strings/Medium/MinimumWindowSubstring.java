/**
 * Problem Name: Minimum Window Substring
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given two strings s and t, return the minimum window in s which contains
 * all characters of t.
 *
 * Pseudocode:
 * 1. Store frequency of characters in t
 * 2. Expand right pointer
 * 3. When all chars matched, shrink from left
 *
 * Approach:
 * Sliding window with frequency tracking.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: s="ADOBECODEBANC", t="ABC"
 * Output: "BANC"
 */

import java.util.*;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        int[] freq = new int[128];
        for(char c : t.toCharArray())
            freq[c]++;

        int left = 0, count = t.length();
        int start = 0, minLen = Integer.MAX_VALUE;

        for(int right = 0; right < s.length(); right++) {

            if(freq[s.charAt(right)]-- > 0)
                count--;

            while(count == 0) {

                if(right - left + 1 < minLen) {
                    start = left;
                    minLen = right - left + 1;
                }

                if(++freq[s.charAt(left++)] > 0)
                    count++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" :
                s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}
