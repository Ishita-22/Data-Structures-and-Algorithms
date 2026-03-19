/**
 * Problem Name: Reorder List (Stack Method)
 * Difficulty: Medium
 *
 * Problem Statement:
 * Reorder list using stack.
 *
 * Approach:
 * Push nodes to stack and reorder.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class ListNode35 {
    int val;
    ListNode35 next;
    ListNode35(int val){ this.val = val; }
}

public class ReorderListStack {

    public static void reorderList(ListNode35 head){

        if(head == null) return;

        Stack<ListNode35> stack = new Stack<>();
        ListNode35 curr = head;

        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }

        int n = stack.size();
        curr = head;

        for(int i=0;i<n/2;i++){

            ListNode35 top = stack.pop();

            ListNode35 next = curr.next;
            curr.next = top;
            top.next = next;

            curr = next;
        }

        curr.next = null;
    }
}
