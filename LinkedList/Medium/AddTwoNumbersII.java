/**
 * Problem Name: Add Two Numbers II
 * Difficulty: Medium
 *
 * Problem Statement:
 * Add numbers stored in forward order.
 *
 * Pseudocode:
 * 1. Push digits into stacks
 * 2. Add with carry
 * 3. Build result in reverse
 *
 * Approach:
 * Stack reverses order for addition.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class ListNode29 {
    int val;
    ListNode29 next;
    ListNode29(int val){ this.val = val; }
}

public class AddTwoNumbersII {

    public static ListNode29 addTwoNumbers(ListNode29 l1, ListNode29 l2){

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1 != null){ s1.push(l1.val); l1 = l1.next; }
        while(l2 != null){ s2.push(l2.val); l2 = l2.next; }

        int carry = 0;
        ListNode29 head = null;

        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){

            int sum = carry;

            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();

            ListNode29 node = new ListNode29(sum % 10);
            node.next = head;
            head = node;

            carry = sum / 10;
        }

        return head;
    }
}
