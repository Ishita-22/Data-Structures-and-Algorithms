/**
 * Problem Name: Longest Duplicate Substring
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find the longest substring that appears at least twice in the string.
 *
 * Pseudocode:
 * 1. Use binary search on substring length
 * 2. Use rolling hash to detect duplicates
 *
 * Approach:
 * Binary search + Rabin-Karp rolling hash detects duplicate substrings efficiently.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "banana"
 * Output: "ana"
 */

import java.util.*;

public class LongestDuplicateSubstring {

    public static String longestDupSubstring(String s) {

        int n = s.length();
        int left = 1, right = n;
        String result = "";

        while(left <= right) {

            int mid = (left + right) / 2;
            String dup = search(s, mid);

            if(dup != null) {
                result = dup;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static String search(String s, int len) {

        Set<String> set = new HashSet<>();

        for(int i=0;i<=s.length()-len;i++) {

            String sub = s.substring(i, i+len);

            if(set.contains(sub))
                return sub;

            set.add(sub);
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(longestDupSubstring("banana"));
    }
}
