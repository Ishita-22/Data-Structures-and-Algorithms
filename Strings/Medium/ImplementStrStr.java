/**
 * Problem Name: Implement strStr
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find first occurrence of needle in haystack.
 *
 * Pseudocode:
 * 1. Traverse haystack
 * 2. Compare substring with needle
 *
 * Approach:
 * Simple substring matching.
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: haystack="hello", needle="ll"
 * Output: 2
 */

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {

        if(needle.isEmpty())
            return 0;

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while(j < needle.length() &&
                    haystack.charAt(i + j) == needle.charAt(j))
                j++;

            if(j == needle.length())
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
