/**
 * Problem Name: Infix to Postfix Conversion
 * Difficulty: Easy
 *
 * Problem Statement:
 * Convert infix expression to postfix.
 *
 * Pseudocode:
 * 1. Traverse expression
 * 2. Push operators based on precedence
 * 3. Pop higher precedence operators
 *
 * Approach:
 * Use stack to manage operator precedence.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class InfixToPostfix {

    static int precedence(char c){
        if(c=='+' || c=='-') return 1;
        if(c=='*' || c=='/') return 2;
        return 0;
    }

    public static String convert(String exp){

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c : exp.toCharArray()){

            if(Character.isLetterOrDigit(c))
                result.append(c);

            else if(c == '(')
                stack.push(c);

            else if(c == ')'){
                while(stack.peek() != '(')
                    result.append(stack.pop());
                stack.pop();
            }

            else{
                while(!stack.isEmpty() &&
                        precedence(c) <= precedence(stack.peek()))
                    result.append(stack.pop());

                stack.push(c);
            }
        }

        while(!stack.isEmpty())
            result.append(stack.pop());

        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(convert("a+b*(c-d)"));
    }
}
