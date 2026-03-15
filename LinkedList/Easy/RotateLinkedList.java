/**
 * Problem Name: Rotate Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Given the head of a linked list, rotate the list to the right by k places.
 *
 * Pseudocode:
 * 1. Find length of list
 * 2. Connect tail to head to form cycle
 * 3. Find new tail at (length - k % length - 1)
 * 4. Break the cycle
 *
 * Approach:
 * Convert the list into a circular list and then break it at the correct position.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: 1->2->3->4->5, k = 2
 * Output: 4->5->1->2->3
 */

class ListNode11 {
    int val;
    ListNode11 next;
    ListNode11(int val){ this.val = val; }
}

public class RotateLinkedList {

    public static ListNode11 rotateRight(ListNode11 head, int k) {

        if(head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        ListNode11 tail = head;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        tail.next = head;

        k = k % length;
        int steps = length - k;

        ListNode11 newTail = tail;

        while(steps-- > 0)
            newTail = newTail.next;

        ListNode11 newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
