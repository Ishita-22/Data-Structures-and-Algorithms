/**
 * Problem Name: Reverse String
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reverse a character array in-place.
 *
 * Pseudocode:
 * 1. Use two pointers
 * 2. Swap characters
 *
 * Approach:
 * Two-pointer swap method.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: ['h','e','l','l','o']
 * Output: ['o','l','l','e','h']
 */

import java.util.Arrays;

public class ReverseString {

    public static void reverse(char[] s) {

        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
}
