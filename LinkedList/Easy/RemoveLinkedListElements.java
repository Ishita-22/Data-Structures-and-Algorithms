/**
 * Problem Name: Remove Linked List Elements
 * Difficulty: Easy
 *
 * Problem Statement:
 * Remove all nodes with a given value from the linked list.
 *
 * Pseudocode:
 * 1. Use dummy node pointing to head
 * 2. Traverse list
 * 3. If node value equals target → skip node
 *
 * Approach:
 * Dummy node simplifies deletion especially when head must be removed.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: 1->2->6->3->4->5->6 , val = 6
 * Output: 1->2->3->4->5
 */

class ListNode16 {
    int val;
    ListNode16 next;
    ListNode16(int val){ this.val = val; }
}

public class RemoveLinkedListElements {

    public static ListNode16 removeElements(ListNode16 head, int val){

        ListNode16 dummy = new ListNode16(0);
        dummy.next = head;

        ListNode16 curr = dummy;

        while(curr.next != null){

            if(curr.next.val == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }

        return dummy.next;
    }
}
