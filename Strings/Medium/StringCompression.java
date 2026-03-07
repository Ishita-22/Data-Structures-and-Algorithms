/**
 * Problem Name: String Compression
 * Difficulty: Medium
 *
 * Problem Statement:
 * Compress the string using counts of repeated characters.
 *
 * Pseudocode:
 * 1. Traverse characters
 * 2. Count duplicates
 * 3. Append char + count
 *
 * Approach:
 * Track consecutive characters and compress.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "aaabb"
 * Output: "a3b2"
 */

public class StringCompression {

    public static String compress(String s) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for(int i = 1; i <= s.length(); i++) {

            if(i < s.length() && s.charAt(i) == s.charAt(i-1))
                count++;
            else {
                result.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabb"));
    }
}
