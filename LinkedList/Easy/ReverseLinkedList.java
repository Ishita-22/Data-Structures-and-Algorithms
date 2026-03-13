/**
 * Problem Name: Reverse Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reverse a singly linked list.
 *
 * Pseudocode:
 * 1. Initialize prev = null, curr = head
 * 2. While curr != null
 *      next = curr.next
 *      curr.next = prev
 *      prev = curr
 *      curr = next
 * 3. Return prev
 *
 * Approach:
 * Iteratively reverse pointers of the linked list.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: 1->2->3->4
 * Output: 4->3->2->1
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){ this.val = val; }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void print(ListNode head) {

        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        print(head);

        head = reverseList(head);

        print(head);
    }
}
