/**
 * Problem Name: Delete All Occurrences in Doubly Linked List
 * Difficulty: Hard
 *
 * Problem Statement:
 * Delete all nodes with given value in doubly linked list.
 *
 * Approach:
 * Adjust prev and next pointers carefully.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class DLLNode {
    int val;
    DLLNode prev, next;
    DLLNode(int val){ this.val = val; }
}

public class DeleteAllOccurrencesDLL {

    public static DLLNode deleteAll(DLLNode head, int x){

        DLLNode curr = head;

        while(curr != null){

            if(curr.val == x){

                if(curr.prev != null)
                    curr.prev.next = curr.next;
                else
                    head = curr.next;

                if(curr.next != null)
                    curr.next.prev = curr.prev;
            }

            curr = curr.next;
        }

        return head;
    }
}
