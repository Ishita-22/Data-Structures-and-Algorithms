/**
 * Problem Name: Substring Check
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check whether a string contains another substring.
 *
 * Pseudocode:
 * 1. Use built-in contains()
 *
 * Approach:
 * Built-in substring search.
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "hello world", "world"
 * Output: true
 */

public class SubstringCheck {

    public static boolean containsSubstring(String text, String pattern) {

        return text.contains(pattern);
    }

    public static void main(String[] args) {
        System.out.println(containsSubstring("hello world","world"));
    }
}
