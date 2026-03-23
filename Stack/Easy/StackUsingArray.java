/**
 * Problem Name: Implement Stack using Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Implement stack using array.
 *
 * Pseudocode:
 * 1. Use array + top pointer
 * 2. push → increment top
 * 3. pop → decrement top
 *
 * Approach:
 * Simulate stack behavior with array.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class StackUsingArray {

    int[] arr;
    int top;
    int size;

    public StackUsingArray(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int val){
        if(top == size-1) return;
        arr[++top] = val;
    }

    public int pop(){
        if(top == -1) return -1;
        return arr[top--];
    }

    public int peek(){
        if(top == -1) return -1;
        return arr[top];
    }
}
