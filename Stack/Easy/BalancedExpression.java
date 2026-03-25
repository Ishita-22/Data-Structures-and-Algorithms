/**
 * Problem Name: Balanced Expression
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check if expression is balanced with (), {}, [].
 *
 * Approach:
 * Use stack to match brackets.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class BalancedExpression {

    public static boolean isBalanced(String s){

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c=='(' || c=='{' || c=='[')
                stack.push(c);

            else{

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
}
