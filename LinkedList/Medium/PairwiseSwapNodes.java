/**
 * Problem Name: Pairwise Swap Nodes
 * Difficulty: Medium
 *
 * Problem Statement:
 * Swap nodes pairwise without changing values.
 *
 * Approach:
 * Adjust pointers for every two nodes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode37 {
    int val;
    ListNode37 next;
    ListNode37(int val){ this.val = val; }
}

public class PairwiseSwapNodes {

    public static ListNode37 swapPairs(ListNode37 head){

        ListNode37 dummy=new ListNode37(0);
        dummy.next=head;
        ListNode37 curr=dummy;

        while(curr.next!=null && curr.next.next!=null){

            ListNode37 first=curr.next;
            ListNode37 second=curr.next.next;

            first.next=second.next;
            second.next=first;
            curr.next=second;

            curr=first;
        }

        return dummy.next;
    }
}
