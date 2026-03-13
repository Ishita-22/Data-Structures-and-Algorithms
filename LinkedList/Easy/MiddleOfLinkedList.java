/**
 * Problem Name: Middle of Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Return the middle node of the linked list.
 *
 * Pseudocode:
 * 1. Use slow and fast pointer
 * 2. Move slow by 1 and fast by 2
 * 3. When fast reaches end, slow is middle
 *
 * Approach:
 * Fast and slow pointer technique.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int val){ this.val = val; }
}

public class MiddleOfLinkedList {

    public static ListNode2 middleNode(ListNode2 head) {

        ListNode2 slow = head;
        ListNode2 fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);

        System.out.println(middleNode(head).val);
    }
}
