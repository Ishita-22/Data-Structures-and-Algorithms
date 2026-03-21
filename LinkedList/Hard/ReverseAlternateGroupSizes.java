/**
 * Problem Name: Reverse Linked List in Groups of Alternate Sizes
 * Difficulty: Hard
 *
 * Problem Statement:
 * Reverse nodes in alternating group sizes.
 *
 * Approach:
 * Alternate between reversing and skipping groups.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode45 {
    int val;
    ListNode45 next;
    ListNode45(int val){ this.val = val; }
}

public class ReverseAlternateGroupSizes {

    public static ListNode45 process(ListNode45 head, int k, boolean reverse){

        if(head == null) return null;

        ListNode45 curr = head, prev = null;
        int count = 0;

        if(reverse){

            while(curr != null && count < k){
                ListNode45 next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            head.next = process(curr, k, !reverse);
            return prev;

        } else {

            while(curr != null && count < k-1){
                curr = curr.next;
                count++;
            }

            if(curr != null)
                curr.next = process(curr.next, k, !reverse);

            return head;
        }
    }
}
