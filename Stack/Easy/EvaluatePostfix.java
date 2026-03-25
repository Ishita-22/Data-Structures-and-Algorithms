/**
 * Problem Name: Evaluate Postfix Expression
 * Difficulty: Easy
 *
 * Problem Statement:
 * Evaluate a postfix expression.
 *
 * Pseudocode:
 * 1. Traverse tokens
 * 2. Push numbers
 * 3. Pop operands for operator
 *
 * Approach:
 * Stack-based evaluation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class EvaluatePostfix {

    public static int eval(String[] tokens){

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){

            if(token.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(token.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(token.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(eval(tokens));
    }
}
