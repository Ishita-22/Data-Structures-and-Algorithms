/**
 * Problem Name: Check Duplicate Parentheses
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check if expression contains duplicate parentheses.
 *
 * Approach:
 * If empty parentheses found → duplicate.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class DuplicateParentheses {

    public static boolean hasDuplicate(String s){

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == ')'){

                if(stack.peek() == '(')
                    return true;

                while(stack.peek() != '(')
                    stack.pop();

                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        return false;
    }
}
