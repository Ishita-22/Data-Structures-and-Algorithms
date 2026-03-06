/**
 * Problem Name: Toggle Case
 * Difficulty: Easy
 *
 * Problem Statement:
 * Convert uppercase letters to lowercase and vice versa.
 *
 * Pseudocode:
 * 1. Traverse characters
 * 2. If uppercase → lowercase
 * 3. If lowercase → uppercase
 *
 * Approach:
 * Use Character class functions.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "HeLLo"
 * Output: "hEllO"
 */

public class ToggleCase {

    public static String toggle(String s) {

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {

            if(Character.isUpperCase(c))
                result.append(Character.toLowerCase(c));
            else if(Character.isLowerCase(c))
                result.append(Character.toUpperCase(c));
            else
                result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggle("HeLLo"));
    }
}
