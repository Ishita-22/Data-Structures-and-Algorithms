/**
 * Problem Name: Rotate List II
 * Difficulty: Medium
 *
 * Problem Statement:
 * Rotate linked list right by k steps.
 *
 * Approach:
 * Same as rotate list but more general use.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode25 {
    int val;
    ListNode25 next;
    ListNode25(int val){ this.val = val; }
}

public class RotateListII {

    public static ListNode25 rotateRight(ListNode25 head, int k){

        if(head == null || head.next == null)
            return head;

        int len = 1;
        ListNode25 tail = head;

        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        tail.next = head;

        k %= len;
        int steps = len - k;

        while(steps-- > 0)
            tail = tail.next;

        ListNode25 newHead = tail.next;
        tail.next = null;

        return newHead;
    }
}
