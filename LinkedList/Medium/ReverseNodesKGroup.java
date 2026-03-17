/**
 * Problem Name: Reverse Nodes in k-Group
 * Difficulty: Medium
 *
 * Problem Statement:
 * Reverse nodes in groups of size k.
 *
 * Pseudocode:
 * 1. Check if k nodes exist
 * 2. Reverse k nodes
 * 3. Recursively process remaining
 *
 * Approach:
 * Reverse group of k nodes and attach recursively.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: 1->2->3->4->5, k=2
 * Output: 2->1->4->3->5
 */

class ListNode21 {
    int val;
    ListNode21 next;
    ListNode21(int val){ this.val = val; }
}

public class ReverseNodesKGroup {

    public static ListNode21 reverseKGroup(ListNode21 head, int k){

        ListNode21 curr = head;
        int count = 0;

        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }

        if(count == k){

            curr = reverseKGroup(curr, k);

            while(count-- > 0){
                ListNode21 temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }

            head = curr;
        }

        return head;
    }
}
