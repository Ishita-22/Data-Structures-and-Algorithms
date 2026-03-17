/**
 * Problem Name: Copy List with Random Pointer
 * Difficulty: Medium
 *
 * Problem Statement:
 * Create a deep copy of a linked list with random pointers.
 *
 * Pseudocode:
 * 1. Insert copy nodes after originals
 * 2. Assign random pointers
 * 3. Separate lists
 *
 * Approach:
 * Interweaving nodes avoids extra space.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Node {
    int val;
    Node next, random;
    Node(int val){ this.val = val; }
}

public class CopyRandomList {

    public static Node copyRandomList(Node head){

        if(head == null) return null;

        Node curr = head;

        while(curr != null){
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = head;

        while(curr != null){
            if(curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = head;
        Node newHead = head.next;

        while(curr != null){
            Node copy = curr.next;
            curr.next = copy.next;

            if(copy.next != null)
                copy.next = copy.next.next;

            curr = curr.next;
        }

        return newHead;
    }
}
