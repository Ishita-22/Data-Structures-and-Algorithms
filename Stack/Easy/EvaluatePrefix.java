/**
 * Problem Name: Evaluate Prefix Expression
 * Difficulty: Easy
 *
 * Problem Statement:
 * Evaluate prefix expression.
 *
 * Approach:
 * Traverse from right and use stack.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class EvaluatePrefix {

    public static int eval(String[] tokens){

        Stack<Integer> stack = new Stack<>();

        for(int i=tokens.length-1;i>=0;i--){

            String token = tokens[i];

            if(token.equals("+")){
                int a=stack.pop(), b=stack.pop();
                stack.push(a+b);
            }
            else if(token.equals("-")){
                int a=stack.pop(), b=stack.pop();
                stack.push(a-b);
            }
            else if(token.equals("*")){
                int a=stack.pop(), b=stack.pop();
                stack.push(a*b);
            }
            else if(token.equals("/")){
                int a=stack.pop(), b=stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
