/**
 * Problem Name: Intersection of Two Linked Lists
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find intersection node of two linked lists.
 *
 * Pseudocode:
 * 1. Two pointers start at headA and headB
 * 2. When pointer reaches end, switch list
 *
 * Approach:
 * Both pointers travel equal distance.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode8 {
    int val;
    ListNode8 next;
    ListNode8(int val){ this.val = val; }
}

public class IntersectionLinkedLists {

    public static ListNode8 getIntersectionNode(ListNode8 a, ListNode8 b){

        ListNode8 p1=a;
        ListNode8 p2=b;

        while(p1!=p2){
            p1 = (p1==null)?b:p1.next;
            p2 = (p2==null)?a:p2.next;
        }

        return p1;
    }
}
