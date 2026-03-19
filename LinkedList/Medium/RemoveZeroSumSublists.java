/**
 * Problem Name: Remove Zero Sum Sublists
 * Difficulty: Medium
 *
 * Problem Statement:
 * Remove consecutive nodes that sum to zero.
 *
 * Approach:
 * Use prefix sum and hashmap.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class ListNode34 {
    int val;
    ListNode34 next;
    ListNode34(int val){ this.val = val; }
}

public class RemoveZeroSumSublists {

    public static ListNode34 removeZeroSum(ListNode34 head){

        ListNode34 dummy = new ListNode34(0);
        dummy.next = head;

        Map<Integer, ListNode34> map = new HashMap<>();

        int sum = 0;
        ListNode34 curr = dummy;

        while(curr != null){
            sum += curr.val;
            map.put(sum, curr);
            curr = curr.next;
        }

        sum = 0;
        curr = dummy;

        while(curr != null){
            sum += curr.val;
            curr.next = map.get(sum).next;
            curr = curr.next;
        }

        return dummy.next;
    }
}
