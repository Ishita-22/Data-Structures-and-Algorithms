/**
 * Problem Name: Linked List Cycle II
 * Difficulty: Easy
 *
 * Problem Statement:
 * Detect the node where the cycle begins.
 *
 * Pseudocode:
 * 1. Detect cycle using slow-fast
 * 2. Move pointer from head and meeting point
 * 3. Intersection is cycle start
 *
 * Approach:
 * Floyd’s cycle detection algorithm.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode14 {
    int val;
    ListNode14 next;
    ListNode14(int val){ this.val = val; }
}

public class LinkedListCycleII {

    public static ListNode14 detectCycle(ListNode14 head) {

        ListNode14 slow = head;
        ListNode14 fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                ListNode14 start = head;

                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }

                return start;
            }
        }

        return null;
    }
}
