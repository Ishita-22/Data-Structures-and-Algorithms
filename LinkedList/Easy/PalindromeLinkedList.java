/**
 * Problem Name: Palindrome Linked List
 * Difficulty: Easy
 *
 * Problem Statement:
 * Determine if a linked list is a palindrome.
 *
 * Pseudocode:
 * 1. Find middle
 * 2. Reverse second half
 * 3. Compare halves
 *
 * Approach:
 * Use fast-slow pointer and reverse list.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode7 {
    int val;
    ListNode7 next;
    ListNode7(int val){ this.val = val; }
}

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode7 head) {

        ListNode7 slow = head;
        ListNode7 fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode7 prev=null;
        while(slow!=null){
            ListNode7 next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }

        while(prev!=null){
            if(head.val!=prev.val)
                return false;
            head=head.next;
            prev=prev.next;
        }

        return true;
    }
}
