/**
 * Problem Name: Reverse Stack Using Recursion
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reverse a stack using recursion.
 *
 * Pseudocode:
 * 1. Pop element
 * 2. Reverse remaining stack
 * 3. Insert at bottom
 *
 * Approach:
 * Recursively manipulate stack.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

import java.util.*;

public class ReverseStack {

    public static void reverse(Stack<Integer> stack){

        if(stack.isEmpty()) return;

        int top = stack.pop();
        reverse(stack);
        insertBottom(stack, top);
    }

    private static void insertBottom(Stack<Integer> stack, int val){

        if(stack.isEmpty()){
            stack.push(val);
            return;
        }

        int top = stack.pop();
        insertBottom(stack, val);
        stack.push(top);
    }

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);

        System.out.println(stack);
    }
}
