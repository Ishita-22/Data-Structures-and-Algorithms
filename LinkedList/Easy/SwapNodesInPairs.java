/**
 * Problem Name: Swap Nodes in Pairs
 * Difficulty: Easy
 *
 * Problem Statement:
 * Swap every two adjacent nodes in a linked list.
 *
 * Pseudocode:
 * 1. Use dummy node
 * 2. Swap nodes pairwise
 * 3. Move pointer forward
 *
 * Approach:
 * Manipulate node pointers to swap pairs.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode12 {
    int val;
    ListNode12 next;
    ListNode12(int val){ this.val = val; }
}

public class SwapNodesInPairs {

    public static ListNode12 swapPairs(ListNode12 head) {

        ListNode12 dummy = new ListNode12(0);
        dummy.next = head;

        ListNode12 curr = dummy;

        while(curr.next != null && curr.next.next != null){

            ListNode12 first = curr.next;
            ListNode12 second = curr.next.next;

            first.next = second.next;
            second.next = first;
            curr.next = second;

            curr = first;
        }

        return dummy.next;
    }
}
