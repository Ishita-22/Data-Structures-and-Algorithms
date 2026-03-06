/**
 * Problem Name: Remove Spaces from String
 * Difficulty: Easy
 *
 * Problem Statement:
 * Remove all spaces from a given string.
 *
 * Pseudocode:
 * 1. Traverse characters
 * 2. Append if not space
 *
 * Approach:
 * Use StringBuilder to rebuild string without spaces.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "Java is fun"
 * Output: "Javaisfun"
 */

public class RemoveSpaces {

    public static String removeSpaces(String s) {

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c != ' ')
                result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("Java is fun"));
    }
}
