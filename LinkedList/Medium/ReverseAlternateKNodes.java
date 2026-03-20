/**
 * Problem Name: Reverse Alternate K Nodes
 * Difficulty: Medium
 *
 * Problem Statement:
 * Reverse every alternate k nodes.
 *
 * Approach:
 * Recursive group processing.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode38 {
    int val;
    ListNode38 next;
    ListNode38(int val){ this.val = val; }
}

public class ReverseAlternateKNodes {

    public static ListNode38 reverseAltK(ListNode38 head, int k){

        ListNode38 curr=head, prev=null, next=null;
        int count=0;

        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }

        if(head!=null)
            head.next=curr;

        count=0;
        while(count<k-1 && curr!=null){
            curr=curr.next;
            count++;
        }

        if(curr!=null)
            curr.next=reverseAltK(curr.next,k);

        return prev;
    }
}
