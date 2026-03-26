/**
 * Problem Name: Redundant Brackets
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check if expression has redundant brackets.
 *
 * Approach:
 * If no operator inside brackets → redundant.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class RedundantBrackets {

    public static boolean hasRedundant(String s){

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == ')'){

                boolean hasOperator = false;

                while(stack.peek() != '('){
                    char top = stack.pop();
                    if(top=='+' || top=='-' || top=='*' || top=='/')
                        hasOperator = true;
                }

                stack.pop();

                if(!hasOperator) return true;
            }
            else{
                stack.push(c);
            }
        }

        return false;
    }
}
