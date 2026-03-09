/**
 * Problem Name: Remove All Adjacent Duplicates
 * Difficulty: Medium
 *
 * Problem Statement:
 * Repeatedly remove adjacent duplicate characters.
 *
 * Pseudocode:
 * 1. Use stack
 * 2. Push char if different
 * 3. Pop if duplicate found
 *
 * Approach:
 * Stack keeps track of previous characters efficiently.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "abbaca"
 * Output: "ca"
 */

import java.util.*;

public class RemoveAdjacentDuplicates {

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            if(!stack.isEmpty() && stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }

        StringBuilder result = new StringBuilder();
        for(char c : stack)
            result.append(c);

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
