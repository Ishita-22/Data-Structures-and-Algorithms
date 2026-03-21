/**
 * Problem Name: Reverse Nodes in K Group (Optimal)
 * Difficulty: Hard
 *
 * Problem Statement:
 * Reverse nodes in k groups iteratively.
 *
 * Approach:
 * Iterative reversal with group tracking.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode42 {
    int val;
    ListNode42 next;
    ListNode42(int val){ this.val = val; }
}

public class ReverseNodesKGroupOptimal {

    public static ListNode42 reverseKGroup(ListNode42 head, int k){

        ListNode42 dummy = new ListNode42(0);
        dummy.next = head;

        ListNode42 prevGroup = dummy;

        while(true){

            ListNode42 kth = prevGroup;

            for(int i=0;i<k && kth!=null;i++)
                kth = kth.next;

            if(kth == null) break;

            ListNode42 nextGroup = kth.next;
            ListNode42 prev = nextGroup;
            ListNode42 curr = prevGroup.next;

            while(curr != nextGroup){
                ListNode42 temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode42 temp = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }

        return dummy.next;
    }
}
