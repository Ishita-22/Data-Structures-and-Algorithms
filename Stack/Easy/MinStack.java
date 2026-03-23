/**
 * Problem Name: Min Stack
 * Difficulty: Easy
 *
 * Problem Statement:
 * Design stack that supports getMin() in O(1).
 *
 * Approach:
 * Use two stacks (main + min stack).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

import java.util.*;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val){
        stack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop(){
        if(stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}
