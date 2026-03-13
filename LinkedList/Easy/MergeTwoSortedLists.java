/**
 * Problem Name: Merge Two Sorted Lists
 * Difficulty: Easy
 *
 * Problem Statement:
 * Merge two sorted linked lists and return sorted list.
 *
 * Pseudocode:
 * 1. Create dummy node
 * 2. Compare nodes
 * 3. Attach smaller node
 *
 * Approach:
 * Iteratively merge two lists.
 *
 * Time Complexity: O(n+m)
 * Space Complexity: O(1)
 */

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4(int val){ this.val = val; }
}

public class MergeTwoSortedLists {

    public static ListNode4 merge(ListNode4 l1, ListNode4 l2) {

        ListNode4 dummy = new ListNode4(0);
        ListNode4 curr = dummy;

        while(l1 != null && l2 != null) {

            if(l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;

        return dummy.next;
    }
}
