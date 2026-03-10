/**
 * Problem Name: Longest Repeating Character Replacement
 * Difficulty: Medium
 *
 * Problem Statement:
 * Replace at most k characters to form longest repeating substring.
 *
 * Pseudocode:
 * 1. Sliding window
 * 2. Track most frequent char
 * 3. Shrink window if replacements exceed k
 *
 * Approach:
 * Window size minus most frequent char count determines replacements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "AABABBA", k=1
 * Output: 4
 */

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] count = new int[26];
        int left = 0, maxCount = 0, maxLen = 0;

        for(int right=0; right<s.length(); right++) {

            maxCount = Math.max(maxCount,
                    ++count[s.charAt(right)-'A']);

            while(right-left+1-maxCount > k) {
                count[s.charAt(left)-'A']--;
                left++;
            }

            maxLen = Math.max(maxLen,
                    right-left+1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(
                characterReplacement("AABABBA",1));
    }
}
