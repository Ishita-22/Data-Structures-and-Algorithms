/**
 * Problem Name: Valid Anagram
 * Difficulty: Easy
 *
 * Problem Statement:
 * Determine if two strings are anagrams.
 *
 * Pseudocode:
 * 1. If lengths differ → return false
 * 2. Count frequency of characters
 * 3. Compare counts
 *
 * Approach:
 * Frequency counting using array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: s="anagram", t="nagaram"
 * Output: true
 */

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int count : freq)
            if(count != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
