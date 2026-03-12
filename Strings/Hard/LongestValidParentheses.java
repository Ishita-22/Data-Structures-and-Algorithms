/**
 * Problem Name: Longest Valid Parentheses
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find the length of the longest valid parentheses substring.
 *
 * Pseudocode:
 * 1. Use stack storing indices
 * 2. Push -1 initially
 * 3. Track max length
 *
 * Approach:
 * Stack helps track unmatched parentheses indices.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "(()"
 * Output: 2
 */

import java.util.*;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int max = 0;

        for(int i=0;i<s.length();i++) {

            if(s.charAt(i)=='(')
                stack.push(i);

            else {

                stack.pop();

                if(stack.isEmpty())
                    stack.push(i);
                else
                    max = Math.max(max, i - stack.peek());
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
    }
}
