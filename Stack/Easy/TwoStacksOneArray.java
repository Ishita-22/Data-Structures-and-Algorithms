/**
 * Problem Name: Two Stacks in One Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Implement two stacks using a single array.
 *
 * Approach:
 * One stack grows from left, another from right.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class TwoStacksOneArray {

    int[] arr;
    int top1, top2;

    public TwoStacksOneArray(int n){
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push1(int val){
        if(top1 + 1 < top2)
            arr[++top1] = val;
    }

    public void push2(int val){
        if(top1 + 1 < top2)
            arr[--top2] = val;
    }

    public int pop1(){
        return (top1 >= 0) ? arr[top1--] : -1;
    }

    public int pop2(){
        return (top2 < arr.length) ? arr[top2++] : -1;
    }
}
