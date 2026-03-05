/**
 * Problem Name: String Equality Check
 * Difficulty: Easy
 *
 * Problem Statement:
 * Determine whether two strings are equal.
 *
 * Pseudocode:
 * 1. Compare lengths
 * 2. Compare each character
 *
 * Approach:
 * Character-by-character comparison.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "abc", "abc"
 * Output: true
 */

public class StringEqualityCheck {

    public static boolean isEqual(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isEqual("abc","abc"));
    }
}
