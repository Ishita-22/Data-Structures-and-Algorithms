/**
 * Problem Name: Add Two Numbers
 * Difficulty: Easy
 *
 * Problem Statement:
 * Add two numbers represented as linked lists.
 *
 * Pseudocode:
 * 1. Traverse both lists
 * 2. Sum digits with carry
 * 3. Store result in new list
 *
 * Approach:
 * Simulate digit-by-digit addition.
 *
 * Time Complexity: O(max(n,m))
 * Space Complexity: O(max(n,m))
 */

class ListNode15 {
    int val;
    ListNode15 next;
    ListNode15(int val){ this.val = val; }
}

public class AddTwoNumbers {

    public static ListNode15 addTwoNumbers(ListNode15 l1, ListNode15 l2) {

        ListNode15 dummy = new ListNode15(0);
        ListNode15 curr = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){

            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            curr.next = new ListNode15(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}
