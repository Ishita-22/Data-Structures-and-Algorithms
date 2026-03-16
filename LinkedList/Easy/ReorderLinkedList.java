/**
 * Problem Name: Reorder List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reorder list as:
 * L0 → Ln → L1 → Ln-1 → L2 → Ln-2 ...
 *
 * Pseudocode:
 * 1. Find middle
 * 2. Reverse second half
 * 3. Merge both halves
 *
 * Approach:
 * Split list and interleave nodes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode18 {
    int val;
    ListNode18 next;
    ListNode18(int val){ this.val = val; }
}

public class ReorderLinkedList {

    public static void reorderList(ListNode18 head){

        if(head == null) return;

        ListNode18 slow = head, fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode18 prev = null, curr = slow.next;
        slow.next = null;

        while(curr != null){
            ListNode18 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode18 first = head;
        ListNode18 second = prev;

        while(second != null){
            ListNode18 temp1 = first.next;
            ListNode18 temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
