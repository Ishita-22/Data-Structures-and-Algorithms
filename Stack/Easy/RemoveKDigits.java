/**
 * Problem Name: Remove K Digits
 * Difficulty: Easy
 *
 * Problem Statement:
 * Remove k digits to make smallest number.
 *
 * Approach:
 * Monotonic increasing stack.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class RemoveKDigits {

    public static String removeKdigits(String num, int k){

        Stack<Character> stack = new Stack<>();

        for(char c : num.toCharArray()){

            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        while(k-- > 0)
            stack.pop();

        StringBuilder sb = new StringBuilder();

        for(char c : stack)
            sb.append(c);

        while(sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
