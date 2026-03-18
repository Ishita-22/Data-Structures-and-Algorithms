/**
 * Problem Name: Remove Duplicates from Unsorted Linked List
 * Difficulty: Medium
 *
 * Problem Statement:
 * Remove duplicates from an unsorted linked list.
 *
 * Pseudocode:
 * 1. Use HashSet
 * 2. Traverse list
 * 3. Skip duplicates
 *
 * Approach:
 * Use extra space to track visited values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class ListNode27 {
    int val;
    ListNode27 next;
    ListNode27(int val){ this.val = val; }
}

public class RemoveDuplicatesUnsorted {

    public static ListNode27 removeDuplicates(ListNode27 head){

        Set<Integer> set = new HashSet<>();
        ListNode27 curr = head, prev = null;

        while(curr != null){

            if(set.contains(curr.val))
                prev.next = curr.next;
            else{
                set.add(curr.val);
                prev = curr;
            }

            curr = curr.next;
        }

        return head;
    }
}
