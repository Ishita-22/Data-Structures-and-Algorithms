/**
 * Problem Name: Reverse Linked List Between Positions (Variant)
 * Difficulty: Medium
 *
 * Problem Statement:
 * Reverse nodes between given positions m and n.
 *
 * Approach:
 * In-place reversal using pointer manipulation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode31 {
    int val;
    ListNode31 next;
    ListNode31(int val){ this.val = val; }
}

public class ReverseBetweenVariant {

    public static ListNode31 reverseBetween(ListNode31 head, int m, int n){

        ListNode31 dummy = new ListNode31(0);
        dummy.next = head;

        ListNode31 prev = dummy;

        for(int i=1;i<m;i++)
            prev = prev.next;

        ListNode31 curr = prev.next;

        for(int i=0;i<n-m;i++){
            ListNode31 next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
