/**
 * Problem Name: First Unique Character in String
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find index of first non-repeating character.
 *
 * Pseudocode:
 * 1. Count frequency using array[26]
 * 2. Traverse string again
 * 3. Return first index with frequency 1
 *
 * Approach:
 * Use frequency counting.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "leetcode"
 * Output: 0
 */

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        for(char c : s.toCharArray())
            freq[c - 'a']++;

        for(int i = 0; i < s.length(); i++)
            if(freq[s.charAt(i) - 'a'] == 1)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
