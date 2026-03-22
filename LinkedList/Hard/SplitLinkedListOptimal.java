/**
 * Problem Name: Split Linked List in Parts (Optimal)
 * Difficulty: Hard
 *
 * Problem Statement:
 * Split list into k parts as evenly as possible.
 *
 * Approach:
 * Calculate size and distribute nodes optimally.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode46 {
    int val;
    ListNode46 next;
    ListNode46(int val){ this.val = val; }
}

public class SplitLinkedListOptimal {

    public static ListNode46[] split(ListNode46 head, int k){

        int n = 0;
        ListNode46 curr = head;

        while(curr != null){
            n++;
            curr = curr.next;
        }

        int size = n / k, extra = n % k;

        ListNode46[] result = new ListNode46[k];
        curr = head;

        for(int i=0;i<k;i++){

            result[i] = curr;
            int partSize = size + (i < extra ? 1 : 0);

            for(int j=1;j<partSize;j++)
                curr = curr.next;

            if(curr != null){
                ListNode46 temp = curr.next;
                curr.next = null;
                curr = temp;
            }
        }

        return result;
    }
}
