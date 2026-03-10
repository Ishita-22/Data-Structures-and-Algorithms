/**
 * Problem Name: Find All Anagrams in a String
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find starting indices of anagrams of p in s.
 *
 * Pseudocode:
 * 1. Use sliding window
 * 2. Compare frequency arrays
 *
 * Approach:
 * Sliding window ensures linear scanning.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: s="cbaebabacd", p="abc"
 * Output: [0,6]
 */

import java.util.*;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(
            String s, String p) {

        List<Integer> result = new ArrayList<>();
        int[] count = new int[26];

        for(char c : p.toCharArray())
            count[c-'a']++;

        int left = 0, right = 0, needed = p.length();

        while(right < s.length()) {

            if(count[s.charAt(right++)-'a']-- > 0)
                needed--;

            if(needed == 0)
                result.add(left);

            if(right-left == p.length() &&
                    count[s.charAt(left++)-'a']++ >= 0)
                needed++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams(
                "cbaebabacd","abc"));
    }
}
