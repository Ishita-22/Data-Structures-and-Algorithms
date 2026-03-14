/**
 * Problem Name: Remove Nth Node From End of List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Remove the nth node from the end of the linked list.
 *
 * Pseudocode:
 * 1. Create dummy node pointing to head
 * 2. Move fast pointer n steps
 * 3. Move slow and fast together
 * 4. Delete node
 *
 * Approach:
 * Two-pointer technique maintains gap of n nodes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: 1->2->3->4->5, n=2
 * Output: 1->2->3->5
 */

class ListNode6 {
    int val;
    ListNode6 next;
    ListNode6(int val){ this.val = val; }
}

public class RemoveNthNodeFromEnd {

    public static ListNode6 removeNthFromEnd(ListNode6 head, int n) {

        ListNode6 dummy = new ListNode6(0);
        dummy.next = head;

        ListNode6 fast = dummy;
        ListNode6 slow = dummy;

        for(int i=0;i<=n;i++)
            fast = fast.next;

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
