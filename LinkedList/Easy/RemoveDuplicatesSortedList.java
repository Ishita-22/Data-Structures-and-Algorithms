/**
 * Problem Name: Remove Duplicates from Sorted Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Remove duplicate nodes from a sorted linked list.
 *
 * Pseudocode:
 * 1. Traverse list
 * 2. If curr.val == curr.next.val
 *      skip node
 *
 * Approach:
 * Since list is sorted, duplicates appear consecutively.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5(int val){ this.val = val; }
}

public class RemoveDuplicatesSortedList {

    public static ListNode5 deleteDuplicates(ListNode5 head) {

        ListNode5 curr = head;

        while(curr != null && curr.next != null) {

            if(curr.val == curr.next.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }

        return head;
    }
}
