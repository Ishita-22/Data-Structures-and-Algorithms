/**
 * Problem Name: Valid Parentheses
 * Difficulty: Easy
 *
 * Problem Statement:
 * Determine if the input string has valid parentheses.
 *
 * Pseudocode:
 * 1. Use stack
 * 2. Push opening brackets
 * 3. Match closing brackets
 *
 * Approach:
 * Stack ensures proper order of parentheses.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "()[]{}"
 * Output: true
 */

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            else {

                if(stack.isEmpty())
                    return false;

                char top = stack.pop();

                if((c==')' && top!='(') ||
                   (c=='}' && top!='{') ||
                   (c==']' && top!='['))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
