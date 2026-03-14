/**
 * Problem Name: Delete Node in Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Delete node without head pointer.
 *
 * Pseudocode:
 * 1. Copy next node value
 * 2. Skip next node
 *
 * Approach:
 * Overwrite node value and bypass next node.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class ListNode9 {
    int val;
    ListNode9 next;
    ListNode9(int val){ this.val = val; }
}

public class DeleteNodeLinkedList {

    public static void deleteNode(ListNode9 node){

        node.val=node.next.val;
        node.next=node.next.next;
    }
}
