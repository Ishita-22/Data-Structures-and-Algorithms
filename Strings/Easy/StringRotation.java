/**
 * Problem Name: String Rotation
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check if one string is rotation of another.
 *
 * Pseudocode:
 * 1. Concatenate s1 + s1
 * 2. Check if s2 exists inside
 *
 * Approach:
 * Rotation must appear in doubled string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: s1="abcde", s2="cdeab"
 * Output: true
 */

public class StringRotation {

    public static boolean isRotation(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        String temp = s1 + s1;

        return temp.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcde","cdeab"));
    }
}
