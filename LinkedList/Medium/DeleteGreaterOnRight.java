/**
 * Problem Name: Delete Nodes Having Greater Value on Right
 * Difficulty: Medium
 *
 * Problem Statement:
 * Delete nodes that have a greater value node on the right.
 *
 * Pseudocode:
 * 1. Reverse list
 * 2. Track max so far
 * 3. Remove smaller nodes
 * 4. Reverse again
 *
 * Approach:
 * Reverse simplifies right-side comparison.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode36 {
    int val;
    ListNode36 next;
    ListNode36(int val){ this.val = val; }
}

public class DeleteGreaterOnRight {

    public static ListNode36 reverse(ListNode36 head){
        ListNode36 prev=null;
        while(head!=null){
            ListNode36 next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }

    public static ListNode36 deleteNodes(ListNode36 head){

        head = reverse(head);
        int max = head.val;

        ListNode36 curr = head;

        while(curr != null && curr.next != null){

            if(curr.next.val < max)
                curr.next = curr.next.next;
            else{
                curr = curr.next;
                max = curr.val;
            }
        }

        return reverse(head);
    }
}
