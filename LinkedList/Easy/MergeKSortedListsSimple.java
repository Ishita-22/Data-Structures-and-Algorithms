/**
 * Problem Name: Merge K Sorted Lists (Simplified)
 * Difficulty: Easy
 *
 * Problem Statement:
 * Merge k sorted linked lists into one sorted list.
 *
 * Pseudocode:
 * 1. Use min heap
 * 2. Insert all head nodes
 * 3. Extract min and add next node
 *
 * Approach:
 * Min heap efficiently keeps smallest element on top.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 */

import java.util.*;

class ListNode20 {
    int val;
    ListNode20 next;
    ListNode20(int val){ this.val = val; }
}

public class MergeKSortedListsSimple {

    public static ListNode20 mergeKLists(ListNode20[] lists){

        PriorityQueue<ListNode20> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        for(ListNode20 node : lists)
            if(node != null)
                pq.add(node);

        ListNode20 dummy = new ListNode20(0);
        ListNode20 curr = dummy;

        while(!pq.isEmpty()){

            ListNode20 node = pq.poll();
            curr.next = node;
            curr = curr.next;

            if(node.next != null)
                pq.add(node.next);
        }

        return dummy.next;
    }
}
