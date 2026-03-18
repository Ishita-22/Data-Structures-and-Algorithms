/**
 * Problem Name: Sort Linked List
 * Difficulty: Medium
 *
 * Problem Statement:
 * Sort a linked list in O(n log n) time.
 *
 * Pseudocode:
 * 1. Find middle
 * 2. Split list
 * 3. Recursively sort both halves
 * 4. Merge sorted lists
 *
 * Approach:
 * Use merge sort since random access is not available.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n)
 */

class ListNode26 {
    int val;
    ListNode26 next;
    ListNode26(int val){ this.val = val; }
}

public class SortLinkedList {

    public static ListNode26 sortList(ListNode26 head){

        if(head == null || head.next == null)
            return head;

        ListNode26 slow = head, fast = head, prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode26 left = sortList(head);
        ListNode26 right = sortList(slow);

        return merge(left, right);
    }

    private static ListNode26 merge(ListNode26 l1, ListNode26 l2){

        ListNode26 dummy = new ListNode26(0);
        ListNode26 curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
