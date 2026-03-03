/**
 * Problem Name: Length of Last Word
 * Difficulty: Easy
 *
 * Problem Statement:
 * Return length of last word in string.
 *
 * Pseudocode:
 * 1. Trim spaces
 * 2. Traverse from end until space
 *
 * Approach:
 * Reverse traversal.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "Hello World"
 * Output: 5
 */

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' ')
            i--;

        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
