/**
 * Problem Name: Partition Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Partition the list so nodes < x come before nodes >= x.
 *
 * Pseudocode:
 * 1. Create two lists (small, large)
 * 2. Append nodes accordingly
 * 3. Connect lists
 *
 * Approach:
 * Maintain two lists and merge them at the end.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode17 {
    int val;
    ListNode17 next;
    ListNode17(int val){ this.val = val; }
}

public class PartitionLinkedList {

    public static ListNode17 partition(ListNode17 head, int x){

        ListNode17 smallDummy = new ListNode17(0);
        ListNode17 largeDummy = new ListNode17(0);

        ListNode17 small = smallDummy;
        ListNode17 large = largeDummy;

        while(head != null){

            if(head.val < x){
                small.next = head;
                small = small.next;
            }else{
                large.next = head;
                large = large.next;
            }

            head = head.next;
        }

        large.next = null;
        small.next = largeDummy.next;

        return smallDummy.next;
    }
}
