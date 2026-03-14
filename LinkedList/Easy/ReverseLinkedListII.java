/**
 * Problem Name: Reverse Linked List II
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reverse a linked list between positions left and right.
 *
 * Pseudocode:
 * 1. Traverse until left
 * 2. Reverse nodes until right
 * 3. Reconnect parts
 *
 * Approach:
 * In-place reversal of sublist.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode10 {
    int val;
    ListNode10 next;
    ListNode10(int val){ this.val = val; }
}

public class ReverseLinkedListII {

    public static ListNode10 reverseBetween(ListNode10 head,int left,int right){

        if(head==null) return null;

        ListNode10 dummy=new ListNode10(0);
        dummy.next=head;

        ListNode10 prev=dummy;

        for(int i=1;i<left;i++)
            prev=prev.next;

        ListNode10 curr=prev.next;

        for(int i=0;i<right-left;i++){

            ListNode10 next=curr.next;

            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }

        return dummy.next;
    }
}
