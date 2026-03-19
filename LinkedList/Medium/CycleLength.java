/**
 * Problem Name: Detect Cycle Length
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find length of cycle in linked list.
 *
 * Approach:
 * Use Floyd's algorithm and count cycle length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode33 {
    int val;
    ListNode33 next;
    ListNode33(int val){ this.val = val; }
}

public class CycleLength {

    public static int cycleLength(ListNode33 head){

        ListNode33 slow = head, fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                int count = 1;
                fast = fast.next;

                while(fast != slow){
                    fast = fast.next;
                    count++;
                }

                return count;
            }
        }

        return 0;
    }
}
