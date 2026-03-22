/**
 * Problem Name: Reverse Linked List in Spiral Form
 * Difficulty: Hard
 *
 * Problem Statement:
 * Reorder list in spiral pattern (L0 → Ln → L1 → Ln-1...)
 *
 * Approach:
 * Use stack to access last elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class ListNode47 {
    int val;
    ListNode47 next;
    ListNode47(int val){ this.val = val; }
}

public class SpiralReorderList {

    public static void reorder(ListNode47 head){

        Stack<ListNode47> stack = new Stack<>();
        ListNode47 curr = head;

        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }

        int n = stack.size();
        curr = head;

        for(int i=0;i<n/2;i++){

            ListNode47 top = stack.pop();

            ListNode47 next = curr.next;
            curr.next = top;
            top.next = next;

            curr = next;
        }

        curr.next = null;
    }
}
