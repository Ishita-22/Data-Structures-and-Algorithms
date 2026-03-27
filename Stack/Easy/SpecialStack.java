/**
 * Problem Name: Special Stack (GetMin without Extra Space)
 * Difficulty: Easy
 *
 * Problem Statement:
 * Design stack that supports getMin() without extra space.
 *
 * Approach:
 * Store modified values to track min.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.*;

public class SpecialStack {

    Stack<Integer> stack = new Stack<>();
    int min;

    public void push(int val){

        if(stack.isEmpty()){
            stack.push(val);
            min = val;
        }
        else if(val < min){
            stack.push(2*val - min);
            min = val;
        }
        else{
            stack.push(val);
        }
    }

    public int pop(){

        int top = stack.pop();

        if(top < min){
            int original = min;
            min = 2*min - top;
            return original;
        }

        return top;
    }

    public int getMin(){
        return min;
    }
}
