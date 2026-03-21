/**
 * Problem Name: Merge K Sorted Lists (Divide & Conquer)
 * Difficulty: Hard
 *
 * Problem Statement:
 * Merge k sorted linked lists into one sorted list.
 *
 * Pseudocode:
 * 1. Divide lists into halves
 * 2. Merge each half recursively
 * 3. Merge results
 *
 * Approach:
 * Divide & conquer reduces complexity compared to brute force.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(log k)
 */

class ListNode41 {
    int val;
    ListNode41 next;
    ListNode41(int val){ this.val = val; }
}

public class MergeKSortedLists {

    public static ListNode41 mergeKLists(ListNode41[] lists){

        if(lists == null || lists.length == 0)
            return null;

        return merge(lists, 0, lists.length-1);
    }

    private static ListNode41 merge(ListNode41[] lists, int left, int right){

        if(left == right)
            return lists[left];

        int mid = (left + right)/2;

        ListNode41 l1 = merge(lists, left, mid);
        ListNode41 l2 = merge(lists, mid+1, right);

        return mergeTwo(l1, l2);
    }

    private static ListNode41 mergeTwo(ListNode41 a, ListNode41 b){

        ListNode41 dummy = new ListNode41(0);
        ListNode41 curr = dummy;

        while(a != null && b != null){
            if(a.val < b.val){
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }

        curr.next = (a != null) ? a : b;

        return dummy.next;
    }
}
