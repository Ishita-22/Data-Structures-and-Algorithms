/**
 * Problem Name: Convert String to Lowercase
 * Difficulty: Easy
 *
 * Problem Statement:
 * Convert all uppercase letters in the string to lowercase.
 *
 * Pseudocode:
 * 1. Traverse characters
 * 2. If uppercase → convert to lowercase
 *
 * Approach:
 * Use built-in Character.toLowerCase().
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "HELLO"
 * Output: "hello"
 */

public class ToLowerCase {

    public static String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray())
            result.append(Character.toLowerCase(c));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("HELLO"));
    }
}
