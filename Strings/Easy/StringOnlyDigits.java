/**
 * Problem Name: String Contains Only Digits
 * Difficulty: Easy
 *
 * Problem Statement:
 * Determine whether a given string contains only numeric digits.
 *
 * Pseudocode:
 * 1. Traverse characters
 * 2. If any char is not digit → return false
 *
 * Approach:
 * Use Character.isDigit() to validate each character.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "12345"
 * Output: true
 */

public class StringOnlyDigits {

    public static boolean isDigits(String s) {

        for(char c : s.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDigits("12345"));
    }
}
