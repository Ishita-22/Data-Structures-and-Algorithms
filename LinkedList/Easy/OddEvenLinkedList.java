/**
 * Problem Name: Odd Even Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Rearrange nodes such that odd indexed nodes come first followed by even indexed nodes.
 *
 * Pseudocode:
 * 1. Maintain odd and even pointers
 * 2. Connect odd nodes together
 * 3. Attach even list at end
 *
 * Approach:
 * Separate odd and even nodes then merge.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode13 {
    int val;
    ListNode13 next;
    ListNode13(int val){ this.val = val; }
}

public class OddEvenLinkedList {

    public static ListNode13 oddEvenList(ListNode13 head) {

        if(head == null) return null;

        ListNode13 odd = head;
        ListNode13 even = head.next;
        ListNode13 evenHead = even;

        while(even != null && even.next != null){

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
