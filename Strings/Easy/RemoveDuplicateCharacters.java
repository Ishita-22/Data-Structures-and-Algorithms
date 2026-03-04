/**
 * Problem Name: Remove Duplicate Characters
 * Difficulty: Easy
 *
 * Problem Statement:
 * Remove duplicate characters from string while keeping first occurrence.
 *
 * Pseudocode:
 * 1. Use boolean array
 * 2. Append character if not seen
 *
 * Approach:
 * Track seen characters with array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "programming"
 * Output: "progamin"
 */

public class RemoveDuplicateCharacters {

    public static String removeDuplicates(String s) {

        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }
}
