/**
 * Problem Name: Sort 0s, 1s, 2s in Linked List
 * Difficulty: Medium
 *
 * Problem Statement:
 * Sort linked list containing only 0s, 1s, and 2s.
 *
 * Approach:
 * Count occurrences and overwrite values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode40 {
    int val;
    ListNode40 next;
    ListNode40(int val){ this.val = val; }
}

public class Sort012LinkedList {

    public static ListNode40 sortList(ListNode40 head){

        int[] count = new int[3];

        ListNode40 curr = head;

        while(curr != null){
            count[curr.val]++;
            curr = curr.next;
        }

        curr = head;

        for(int i=0;i<3;i++){
            while(count[i]-- > 0){
                curr.val = i;
                curr = curr.next;
            }
        }

        return head;
    }
}
