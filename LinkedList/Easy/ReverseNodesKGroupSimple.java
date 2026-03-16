/**
 * Problem Name: Reverse Nodes in K Group (Simplified)
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reverse nodes of a linked list in groups of k.
 *
 * Pseudocode:
 * 1. Count k nodes
 * 2. Reverse group
 * 3. Recursively process remaining list
 *
 * Approach:
 * Reverse every k nodes and reconnect groups.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode19 {
    int val;
    ListNode19 next;
    ListNode19(int val){ this.val = val; }
}

public class ReverseNodesKGroupSimple {

    public static ListNode19 reverseKGroup(ListNode19 head, int k){

        ListNode19 curr = head;
        int count = 0;

        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }

        if(count == k){

            curr = reverseKGroup(curr, k);

            while(count-- > 0){
                ListNode19 temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }

            head = curr;
        }

        return head;
    }
}
