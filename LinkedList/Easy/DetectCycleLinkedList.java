/**
 * Problem Name: Detect Cycle in Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Determine if a linked list has a cycle.
 *
 * Pseudocode:
 * 1. Use slow and fast pointers
 * 2. If they meet → cycle exists
 *
 * Approach:
 * Floyd’s Cycle Detection Algorithm.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int val){ this.val = val; }
}

public class DetectCycleLinkedList {

    public static boolean hasCycle(ListNode3 head) {

        if(head == null) return false;

        ListNode3 slow = head;
        ListNode3 fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }
}
