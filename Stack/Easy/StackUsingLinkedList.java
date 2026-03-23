/**
 * Problem Name: Implement Stack using Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Implement stack using linked list.
 *
 * Approach:
 * Use head as top pointer.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

class NodeStack {
    int val;
    NodeStack next;
    NodeStack(int val){ this.val = val; }
}

public class StackUsingLinkedList {

    NodeStack top;

    public void push(int val){
        NodeStack node = new NodeStack(val);
        node.next = top;
        top = node;
    }

    public int pop(){
        if(top == null) return -1;
        int val = top.val;
        top = top.next;
        return val;
    }

    public int peek(){
        return (top == null) ? -1 : top.val;
    }
}
